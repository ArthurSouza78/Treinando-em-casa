import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cinema");
        Scanner inUser = new Scanner(System.in);

        double ingresso = 0;

        System.out.println("""
                Seja bem vindo ao Cinemas Arthur!
                Selecione qual filme você quer assistir:

                1- Street fighter 
                Gênero: Ação | classificação: 14 anos.

                2- Verity
                Gênero: Drama, romance, suspense | classificação: 16 anos.

                3- Se eu fosse você 3
                Gênero: Comédia | classificação: 12 anos.

                4- Minha melhor amiga 
                Gênero: Comédia | classificação: 12 anos.

                5- Outra mamãe (ou Resident evil em algumas redes)
                Gênero: Drama/Terror | classificação: 18 anos.

                6- As aventuras de Tadeo e a lâmpada mágica
                Gênero: Animação, aventura | classificação: 10 anos.

                7- Um trio quase perfeito 3
                Gênero: Comédia | classificação: Livre / 6 anos.

                8- Coração selvagem
                Gênero: Ação | classificação: 14 anos.

                """);
                int filmeEsc = inUser.nextInt();

                switch (filmeEsc) {
                    case 1:{ System.out.println("""

                        Você escolheu Street fighter, 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$43,00
                        Qualquer número- 3D | R$54,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 43)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 54)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }

                    case 2:{ System.out.println("""

                        Você escolheu Verity, 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$41,00
                        Qualquer número- 3D | R$50,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 41)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 50)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }

                    case 3:{ System.out.println("""

                        Você escolheu Se eu fosse você 3, 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$35,00
                        Qualquer número- 3D | R$43,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 35)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 43)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }

                    case 4:{ System.out.println("""

                        Você escolheu Minha melhor amiga, 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$29,00
                        Qualquer número- 3D | R$40,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 29)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 40)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }

                    case 5:{ System.out.println("""

                        Você escolheu Outra mamãe (ou Resident evil em algumas redes), 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$48,00
                        Qualquer número- 3D | R$60,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 48)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 60)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }

                    case 6:{ System.out.println("""

                        Você escolheu As aventuras de Tadeo e a lâmpada mágica, 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$30,00
                        Qualquer número- 3D | R$40,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 30)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 40)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }

                    case 7:{ System.out.println("""

                        Você escolheu Um trio quase perfeito 3, 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$34,00
                        Qualquer número- 3D | R$48,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 34)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 48)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }

                    case 8:{ System.out.println("""

                        Você escolheu Coração selvagem, 
                        Você quer assistir em 2D ou 3D?
                        Selecione 1 - 2D | R$25,00
                        Qualquer número- 3D | R$32,00
                            
                            """);
                        int doisDoutresD = inUser.nextInt();
                        
                        if(doisDoutresD == 1){
                            System.out.println("Você selecionou 2D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 25)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        }else{
                            System.out.println("Você selecionou 3D, quantos ingressos vai querer?");
                            int qtdeIngresso = inUser.nextInt();
                            System.out.printf("""
                                Você selecionou %d ingressos, o total deu R$%.2f\n
                                 Selecione a forma de pagamento:
                                1 - Cartão
                                2 - Pix
                                """,qtdeIngresso, (ingresso + 32)*qtdeIngresso);
                            int pagamento = inUser.nextInt();
                         if (pagamento == 1) {
                        System.out.println(" 1- Débito\n 2- Crédito");
                        int DebCre = inUser.nextInt();
                        switch (DebCre) {
                            case 1: System.out.println("Debito selecionado.");
                                
                                break;
                            case 2: System.out.println("Crédito selecionado");
                                break;
                        
                            default: System.out.println("Opção invalidá, tente novamente.");
                                break;
                        }
                         }else{
                        System.out.println("Pix selecionado.");
                        }
                        } break;
                    }


                    default: System.out.println("Opção invalidá, tente novamente.");
                }

        inUser.close();
    }
}
