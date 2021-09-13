import java.io.*; 

public class A4 {
static BufferedReader br;
static BufferedWriter bw;
static double f2(double x, double y) throws IOException{
double z;
z = x * x - y * y;
return z;
}
public static void main (String[] args) throws IOException {
int x;
br = new BufferedReader(new FileReader("A41.input"));
x = Integer.valueOf(br.readLine());
int y;
br = new BufferedReader(new FileReader("A42.input"));
y = Integer.valueOf(br.readLine());
double z;
z = f2(x, y) + f2(y, x) * 0.5;
bw = new BufferedWriter(new FileWriter("A4.output"));
bw.write("" + (z));
bw.close();

}

}