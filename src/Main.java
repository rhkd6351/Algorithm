import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Main {
    static BufferedWriter bw;
    public static void main(String[] args) {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        star(n,0,0,false, true);
        try{
            bw.flush();
            bw.close();
        }catch (Exception e){}
    }

    public static void star(int n, int i, int t, boolean blank, boolean first){
        try {
            if (first) {
                if (n == 3) {
                    for (i = 0; i < n; i++) {
                        for (t = 0; t < n; t++) {
                            if (blank) {
                                bw.write(" ");
                            } else {
                                if (Math.floor(i / (n / 3)) == 0. || Math.floor(i / (n / 3)) == 2.)
                                    bw.write("*");
                                else if (Math.floor(i / (n / 3)) == 1. && Math.floor(t / (n / 3)) == 1.)
                                    bw.write(" ");
                                else
                                    bw.write("*");
                            }
                        }
                        bw.newLine();
                    }
                } else {
                    for (i = 0; i < n; i++) {
                        for (t = 0; t < n; t++) {
                            if (Math.floor(i / (n / 3)) == 0 || Math.floor(i / (n / 3)) == 2)
                                star(n / 3, i % (n / 3), t % (n / 3), blank, false);
                            else if (Math.floor(i / (n / 3)) == 1 && Math.floor(t / (n / 3)) == 1)
                                star(n / 3, i % (n / 3), t % (n / 3), true, false);
                            else
                                star(n / 3, i % (n / 3), t % (n / 3), blank, false);
                        }
                        bw.newLine();
                    }
                }
            } else if (n == 3) {
                if (blank == true) {
                    bw.write(" ");
                } else {
                    if (Math.floor(i / (n / 3)) == 0 || Math.floor(i / (n / 3)) == 2)
                        bw.write("*");
                    else if (Math.floor(i / (n / 3)) == 1 && Math.floor(t / (n / 3)) == 1)
                        bw.write(" ");
                    else
                        bw.write("*");
                }
            } else {
                if (Math.floor(i / (n / 3)) == 0 || Math.floor(i / (n / 3)) == 2)
                    star(n / 3, i % (n / 3), t % (n / 3), blank, false);
                else if (Math.floor(i / (n / 3)) == 1 && Math.floor(t / (n / 3)) == 1)
                    star(n / 3, i % (n / 3), t % (n / 3), true, false);
                else
                    star(n / 3, i % (n / 3), t % (n / 3), blank, false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}