package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
    public static   class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x=" + x + " y=" + y;
        }


        public static Point findCentroid(List<Point> points) {
            int x = 0;
            int y = 0;
            for (Point p : points) {
                x += p.x;
                y += p.y;
            }
            Point center = new Point(0, 0);
            center.x = x / points.size();
            center.y = y / points.size();
            return center;
        }

        public  static List<Point> sortVerticies(List<Point> points) {
            // get centroid
            Point center = findCentroid(points);
            Collections.sort(points, (a, b) -> {
                double a1 = (Math.toDegrees(Math.atan2(a.x - center.x, a.y - center.y)) + 360) % 360;
                double a2 = (Math.toDegrees(Math.atan2(b.x - center.x, b.y - center.y)) + 360) % 360;
                return (int) (a1 - a2);
            });
            return points;
        }

        // (X[i], Y[i]) are coordinates of i'th point.
        public static double polygonArea(double X[], double Y[], int n) {
            // Initialze area
            double area = 0.0;

            // Calculate value of shoelace formula
            int j = n - 1;
            for (int i = 0; i < n; i++)
            {
                area += (X[j] + X[i]) * (Y[j] - Y[i]);

                // j is previous vertex to i
                j = i;
            }

            // Return absolute value
            return Math.abs(area / 2.0);
//        return area/2.0;
        }


    }
    public static void main(String[] args) throws java.lang.Exception{

        Reader sc=new Reader();
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int I=sc.nextInt();
            int B=sc.nextInt();
            int N=sc.nextInt();
            List<Point> myPoints=new ArrayList<>();
            for (int i=0;i<N;i++){
                Point newPoint=new Point(sc.nextInt(),sc.nextInt());
                myPoints.add(newPoint);
            }
            List<Point> sortedPoints=new ArrayList<>();
            sortedPoints=Point.sortVerticies(myPoints);

//            System.out.println("Sorted Points Now");
//            for (int i=0;i<sortedPoints.size();i++){
//                System.out.println("x="+sortedPoints.get(i).x+" "+"y= "+sortedPoints.get(i).y);
//            }

            double[] X=new double[N];
            double[] Y=new double[N];

            for (int i=0;i<N;i++){
                X[i]=sortedPoints.get(i).x;
                Y[i]=sortedPoints.get(i).y;
            }

//            System.out.println(Point.polygonArea(X, Y, N));
            wr.write(Point.polygonArea(X,Y,N)+"\n");
        }
        wr.flush();


    }
}
