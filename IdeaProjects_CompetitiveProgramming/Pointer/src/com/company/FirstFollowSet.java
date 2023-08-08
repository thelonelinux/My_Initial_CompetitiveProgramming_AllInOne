package com.company;
import java.util.Stack;

public class FirstFollowSet {

    private final String[] term_tokens = {"begin", "end", ";", "if", "then", "else", "fi", "i", "=", "+", "-", "*",
            "/", "(", ")", "const"};
    private final static String[] non_term_tokens = {"Start", "Prog", "Block", "Body", "S", "E", "T", "F"};
    private static RuleStack rules;
    private Stack<String> firstSet;
    private Stack<String> followSet;

    private boolean is_terminal(String str) {
        boolean test = false;
        for (int i = 0; i < term_tokens.length; i++) {
            if (str.equals(term_tokens[i]))
                test = true;
        }

        return test;
    }

    private boolean is_non_term(String str) {
        for (int i = 0; i < non_term_tokens.length; i++) {
            if (str.equals(non_term_tokens[i])) {
                return true;
            }

        }
        return false;
    }

    private class Rule {
        String def, token;

        public Rule() {
            def = "";
            token = "";
        }

        public Rule(String d, String t) {
            def = d;
            token = t;
        }

        public String getDef() {
            return def;
        }

        public String getToken() {
            return token;
        }

        public String toString() {
            String str = "";
            str += token + " " + def + '\n';
            return str;
        }
    }

    public class RuleStack {
        Stack<Rule> rules;

        public RuleStack(String grammar) {
            if (grammar.equals("G1")) ;
            {
                rules = new Stack();
                Rule rule = new Rule("Prog", "Start");
                rules.push(rule);
                rule = new Rule("Block #", "Prog");
                rules.push(rule);
                rule = new Rule("begin Body end", "Block");
                rules.push(rule);
                rule = new Rule("begin S end", "Body");
                rules.push(rule);
                rule = new Rule("Body ; S", "Body");
                rules.push(rule);
                rule = new Rule("S", "Body");
                rules.push(rule);
                rule = new Rule("if E then S else S fi", "S");
                rules.push(rule);
                rule = new Rule("if E else S fi", "S");
                rules.push(rule);
                rule = new Rule("i = E", "S");
                rules.push(rule);
                rule = new Rule("Block", "S");
                rules.push(rule);
                rule = new Rule("E + T", "E");
                rules.push(rule);
                rule = new Rule("E * T", "E");
                rules.push(rule);
                rule = new Rule("T", "E");
                rules.push(rule);
                rule = new Rule("T * F", "T");
                rules.push(rule);
                rule = new Rule("T / F", "T");
                rules.push(rule);
                rule = new Rule("F", "T");
                rules.push(rule);
                rule = new Rule("const", "F");
                rules.push(rule);
                rule = new Rule("( E )", "F");
                rules.push(rule);
            }
        }

    }

    public FirstFollowSet() {
        rules = new RuleStack("G1");
        firstSet = new Stack();
        followSet = new Stack();
    }

    public String FindFirstSet(String str, Stack<String> used) {
        if (used.contains(str)) {
            return null;
        }
        String firstToken = "";
        String win = "";
        if (str.indexOf(" ") != -1)
            firstToken = str.substring(0, str.indexOf(" "));
        else
            firstToken = str;
        if (is_terminal(firstToken)) {
            if (!(firstSet.contains(firstToken)))
                win = firstToken;
            if (win.equals("") != true)
                firstSet.push(win);
        } else if (is_non_term(firstToken) && !(used.contains(firstToken))) {
            used.push(firstToken);
            if (firstToken.equals("lambda")) {
                if (!(firstSet.contains(firstToken)))
                    win = firstToken;
            } else {
                RuleStack rules = new RuleStack("G1");
                while (rules.rules.isEmpty() != true) {
                    Rule winner = rules.rules.pop();
                    if (winner.token.equals(firstToken)) {
                        String test = FindFirstSet(winner.def, used);
                        if (!(test.equals("lambda"))) {
                            if (!(firstSet.contains(test)))
                                win = test;
                        }
                    }
                }
            }
        }

        return win;
    }

    public void findFollowSet(String str) {
        if (str.equals("S")) {
            followSet.push("$");
        }

        for (int i = 0; i < non_term_tokens.length; i++) {
            if (str.contains(non_term_tokens[i])) {
                int index = str.indexOf(non_term_tokens[i]);
                Stack<String> used = new Stack();
                FirstFollowSet test = new FirstFollowSet();
                if (index > 0 && index < str.length() - 1) {
                    test.FindFirstSet(str, used);
                    while (test.firstSet.isEmpty() != true) {
                        String token = firstSet.pop();
                        if (!(token.equals("lambda")))
                            test.followSet.push(token);
                    }
                } else if (index > 0 && index == str.length() - 1) {

                }
            }
        }
    }

    public static void main(String[] args) {
        FirstFollowSet test = new FirstFollowSet();
        Stack<String> used = new Stack();
        test.FindFirstSet("S", used);
        while (test.firstSet.isEmpty() != true) {
            String str = test.firstSet.pop();
            System.out.println(str);
        }
    }

}