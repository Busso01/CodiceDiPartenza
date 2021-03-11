public class myString {
    public String longest(String x, String y){
        assert x.length() == y.length(): "le stringhe sono uguali";
        if (x.length() > y.length()) {
            return x;
        }else return y;
    }

    public String concat(String[] array) {
        assert array != null : "array vuoto";
        String total = "";
        for (String s : array) {
            total = total.concat(s);
        }
        return total;
    }

    public int calco(String esp){
        Stack s = new Stack(100);
        int numeroIstruzioni = esp.length(); //lunghezza
        int pc = 0; // inizio leggendo la prima istruzione, in posizione 0

        while (pc < numeroIstruzioni) { //eseguo le istruzioni in ordine
            char c = esp.charAt(pc); //c = carattere di posto pc

            if (c >= '0' && c <= '9') { //vero se c e' una cifra
                s.push(c - '0');  //questa formula mi da' il valore della cifra c
            } else if (c == '+') {
                int ultimo = s.pop(); //risultato ultimo calcolo
                int penultimo = s.pop(); //risultato penultimo calcolo
                s.push(penultimo + ultimo);
            } else if (c == '*') {
                int ultimo = s.pop(); //risultato ultimo calcolo
                int penultimo = s.pop(); //risultato penultimo calcolo
                s.push(penultimo * ultimo);
            } else if (c == '-') {
                int ultimo = s.pop();
                int penultimo = s.pop();
                s.push(penultimo - ultimo);
            } else if (c == '/'){
                int ultimo = s.pop();
                int penultimo = s.pop();
                s.push(penultimo / ultimo);
            } else if (c == '%'){
                int ultimo = s.pop();
                int penultimo = s.pop();
                s.push(penultimo % ultimo);
            }

            pc++; // passiamo alla prossima istruzione
        }
        return s.pop();
    }

    public String trim(String frase){
        int i = 0, n = 0, m = 0;
        String s = "";
        char c = frase.charAt(i);
        while (c == ' '){
            n++;
            i++;
            c = frase.charAt(i);
        }
        c = frase.charAt(frase.length() - 1);
        i = frase.length() - 1;
        while (c == ' '){
            i--;
            c = frase.charAt(i);
            m++;
        }
        for (int j = n; j < (frase.length() - m); j++){
            s = s + frase.charAt(j);
        }
        return s;
    }
}
