public class Concorrenti extends Thread
{
    private String nome;


    public Concorrenti(String nome) 
    {
        this.nome = nome;
    }


    public String getNome() 
    {
        return this.nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
        public void run()
        {
        for (int i=0 ;i<100;i++)
        {
            conta++;
            System.out.println(nome + " è a : " + conta)
        }
        system.out.println("bella gara  " + nome);
        }
}
