public class Student {
	
	String name;	
	int course;		
	boolean budgetary;
	String committee;
	String city;
	MedicalGroup medGroup;
	Committee org;

	void settle() {
		if (city != "Kazan") {
			System.out.println ("Settle into dormitory");
		}
	}

	void setMedicalGroup(MedicalGroup newMedicalGroup) {
		medGroup = newMedicalGroup;
	}
	MedicalGroup getMedGroup() {
		return medGroup;
	}

	void achievements() { 

	}

	void stipend() {
		if (budgetary = true) {
		System.out.println("Receives a monthly stipend");
		}
	}

	void setCommittee(Committee newCommittee) {
		org = newCommittee;
	}
	Committee getOrg() {
		return org;
	}
}
