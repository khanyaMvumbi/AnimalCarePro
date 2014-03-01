/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Service.Encapsulation.Correction;

/**
 *
 * @author Khanya
 */
public class Treatment {
    private String treatmentCode;
    private String description;
    private String treatmentName;

    /**
     * @return the treatmentCode
     */
    public String getTreatmentCode() {
        return treatmentCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the treatmentName
     */
    public String getTreatmentName() {
        return treatmentName;
    }

    /**
     * @param treatmentCode the treatmentCode to set
     */
    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param treatmentName the treatmentName to set
     */
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }
    
    
}
