package uk.gov.nhsdigital.provdirsched.client.main;

import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Meta;
import org.hl7.fhir.dstu3.model.Organization;


public class PreCondition_CreateOrganization {
	
public static Organization createOrganization(){
		
		Organization org = new Organization();
		org.setId("13daadee-26e1-4d6a-9e6a-7f4af9b58878");
		org.setName("THE WHITTINGTON HOSPITAL NHS TRUST");
		
		Meta meta = new Meta();
		meta.addProfile("https://fhir.nhs.uk/StructureDefinition/GPConnect-organization-1");
		org.setMeta(meta);
		
		Identifier rr2 = new Identifier();
		rr2.setSystem("http://fhir.nhs.net/Id/ods-organization-code").setValue("RKE");
		List<Identifier> idenList = new ArrayList<Identifier>();
		idenList.add(rr2);
		org.setIdentifier(idenList);
		return org;
	}

}
