package ThinkJava;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] palavra1 = {"24/7", "várias camadas", "30000 pés", "B-to-B", "todos ganham", "front", "back", "end"};
        String[] palavra2 = {"habilitado", "central", "page", "tab", "posicionado"};
        String[] palavra3= {"processo", "ponto máximo", "arquitetura", "mindshare", "portal", "cooperativo"};

        int tam1 = palavra1.length;
        int tam2 = palavra2.length;
        int tam3 = palavra3.length;


        int rand1 = (int) (Math.random() * tam1);
        int rand2 = (int) (Math.random() * tam2);
        int rand3 = (int) (Math.random() * tam3);

        String frase  = palavra1[rand1] + " " + palavra2[rand2] + " " + palavra3[rand3];
        System.out.println(frase);

    }
}
