package uk.gov.nhsdigital.provdirsched.client.main;


import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Location.LocationStatus;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.codesystems.LocationMode;


public class PreCondition_Location {
	
public static Location CreateLocation(){
		
		final Location loc1 = new Location();
		
		loc1.setId("13daadee-26e1-4d6a-9e6a-7f4af9b58877");
		loc1.setStatus(LocationStatus.ACTIVE);
		loc1.setName("Schedule 1 for general appointments");
		//loc1.setModeElement(LocationMode.KIND);
		//loc1.setMode(LocationMode.INSTANCE);
		
		CodeableConcept servtype = (CodeableConcept) loc1.getType().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/c80-practice-codes").setCode("DX").setDisplay("DX"));
		servtype.setText("General medicine");
		loc1.setManagingOrganization(new Reference().setReference("Organization/4956").setDisplay("MGP Medical Centre"));
		
		return loc1;
		
	}

}
