package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Pedido;
import br.senai.sp.jandira.model.Produto;

public class App {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.descricao = "Mouse blu-tooth";
        p1.valor = 100.0;

        p2.descricao = "Teclado ABNT2";
        p2.valor = 15.99;

        p3.descricao = "Pendrive 2T";
        p3.valor = 189.99;

        Cliente c1 = new Cliente();
        c1.nome = "Fabiana Gomes";
        c1.telefone = "7777-7777";
        c1.email = "fab@ig.com.br";

        Pedido ped1 = new Pedido();
        ped1.cliente = c1;
        ped1.numero = 1;
        ped1.total = 500.0;
        ped1.produtos.add(p3);
        ped1.produtos.add(p3);
        ped1.produtos.add(p3);
        ped1.produtos.add(p3);
        ped1.produtos.add(p3);
        ped1.produtos.add(p2);
        ped1.produtos.add(p2);

        ped1.mostrarPedido();
    }
}
