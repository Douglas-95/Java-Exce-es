public class TesteConexao {
    
    public static void main(String[] args) {

        //forma de simplificar o cod
        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch(IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }





        /* Aqui em baixo temos o código antigo
        Conexao con = null;

        try {
            con = new Conexao();
            con.leDados();
        }catch(IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }finally{
            System.out.println("finally");
            if(con != null){
                con.close();
            }
            
        }*/
    }
}
