import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Transaction tx1 = new Transaction("Jeeva", "Vinoth", 5);
			Transaction tx2 = new Transaction("Satheesh", "Jeeva", 10);
			
			Transaction tx3 = new Transaction("Atun", "Dhana", 8);
			Transaction tx4 = new Transaction("Dhana", "Arun", 2);
			
			Transaction tx5 = new Transaction("Arun", "Priyanka", 1);
			Transaction tx6 = new Transaction("Dhana", "Priyanka", 3);
			
			Block block1 = new Block();
			Block block2 = new Block();
			Block block3 = new Block();
			
			block1.add_transaction(tx1);
			block1.add_transaction(tx2);
			
			block2.add_transaction(tx3);
			block2.add_transaction(tx4);
			
			block3.add_transaction(tx5);
			block3.add_transaction(tx6);
			
			block1.finalizeBlock();
			System.out.println(block1.validate());
			
			block2.finalizeBlock();
			System.out.println(block2.validate());
			
			block3.finalizeBlock();
			System.out.println(block3.validate());
			
			Blockchain bc = new Blockchain();
			bc.add_blocks(block1);
			bc.add_blocks(block2);
			bc.add_blocks(block3);
			
			String bcStatus =  bc.validateChain() ? "Passed" : "Failed";
			
			System.out.println("Block Chain Validation " + bcStatus);
			
			File f = new File("block.json");
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);
			/*bw.write(block1.toString());
			bw.write(block2.toString());
			bw.write(block3.toString());*/

			//bw.write(bc.toString());
			
			
			bw.flush();
			bw.close();
			
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			//char[] data = new char[(int) f.length()];
			//br.read(data);
			
			Blockchain brRead = Blockchain.blockchainFromJson(br);
			System.out.println(brRead);
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
