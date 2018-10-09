
public class main {

	public static void main(String[] args) {
		
		System.out.println("Kelas Kotak");
		
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		
		main.setpanjang(15.72);
		main.setlebar(2.23);
			
		// method getter kotak
		
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("Kelas mahasiswa");
		
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		
		//method setter mahasiswa
		
		mahasiswa.nama     = "Nurlinah";
		mahasiswa.nim   = "D0217326";
		mahasiswa.alamat = "Simullu";
		mahasiswa.golonganDarah = "O";
		mahasiswa.status = "Mahasiswa";
		mahasiswa.tinggiBadan = "155";
		mahasiswa.beratBadan = "50";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		
		System.out.println("Kelas node");
		
		//membuat object dari kelas node
		
		node node = new node();
		node.label = "Saya Belajar Coding";
		node.value = 12;
		
		System.out.println("label : " + node.setlabel());
		System.out.println("value : " + node.setvalue());
		
		//membuat object dari kelas Stack
		
		Stack Stack = new Stack();
		
		Stack.value[0] = "Nurlinah";
		Stack.value[1] = "Kurnia";
		Stack.value[2]= "Rismawati";
		Stack.value[3]= "Nurul Amaliah";
		Stack.value[4]= "Nur Insyirah";
		Stack.value[5]= "Hijrahwati";
		Stack.setvalueAt(5 ,"Hijrawati");

		
		for(int i=0;i<Stack.value.length;i++){System.out.println(Stack.value[i]);};

		

	}
	}




