public class JAeXample {

    public static void main(String[] args) {

        String[] s = {"hello:1","what:2","is:3","going:4",
                "on:5","moving:6","back:7","earth:8","world:9"};
        JAeXample jax = new JAeXample();
        String temp;

        jax.display(s);
        jax.rotate(s,3);
        jax.display(s);
        jax.revolve(s,6);
        jax.display(s);
    }

    private void revolve(String[] s, int i) {
        int z=0;
        String[] temp = new String[i];

        for(int j= s.length-1;j>=0;j--){

            if(z<i){
                temp[z] = s[j];
                z++;
            } else {
                s[j+i] = s[j];
            }
        }
        for(int k=i;k>0;k--){
            s[k-1]=temp[i-k];
        }

    }

    private void rotate(String[] s, int i) {

        String[] temp = new String[i];

        for(int j=0;j<s.length;j++){

            if(j<i){
                temp[j] = s[j];
            } else{
                s[j-i]=s[j];
            }
        }
        for(int k=0;k<i;k++){
            s[s.length-i+k]=temp[k];
        }
    }

    private void display(String[] s) {

        for (String z : s){
            System.out.print(z+"\t");
        }
        System.out.println();
    }

}
