package org.way2it.data_structures.HwAnnotation21.First;


public class Auto {

  @FirstAnno("SUV")
  private String typeAuto;
  @FirstAnno("1900 kg")
  private String loadCaptAuto;
  @FirstAnno("Black")
  private String colorAuto;
  @FirstAnno("BMW X5")
  private String modelAuto;

  public Auto(String typeAuto, String loadCaptAuto, String colorAuto, String modelAuto) {
    this.typeAuto = typeAuto;
    this.loadCaptAuto = loadCaptAuto;
    this.colorAuto = colorAuto;
    this.modelAuto = modelAuto;
  }

  public String getTypeAuto() {
    return typeAuto;
  }

  public void setTypeAuto(String typeAuto) {
    this.typeAuto = typeAuto;
  }

  public String getLoadCaptAuto() {
    return loadCaptAuto;
  }

  public void setLoadCaptAuto(String loadCaptAuto) {
    this.loadCaptAuto = loadCaptAuto;
  }

  public String getColorAuto() {
    return colorAuto;
  }

  public void setColorAuto(String colorAuto) {
    this.colorAuto = colorAuto;
  }

  public String getModelAuto() {
    return modelAuto;
  }

  public void setModelAuto(String modelAuto) {
    this.modelAuto = modelAuto;
  }

  @Override
  public String toString() {
    return "Auto{" +
        "typeAuto='" + typeAuto + '\'' +
        ", loadCaptAuto=" + loadCaptAuto +
        ", colorAuto='" + colorAuto + '\'' +
        ", modelAuto='" + modelAuto + '\'' +
        '}';
  }
}
