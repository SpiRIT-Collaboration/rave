/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveVector7D extends RaveVector6D {
  private long swigCPtr;

  protected RaveVector7D(long cPtr, boolean cMemoryOwn) {
    super(raveJNI.RaveVector7D_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveVector7D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveVector7D(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RaveVector7D() {
    this(raveJNI.new_RaveVector7D__SWIG_0(), true);
  }

  public RaveVector7D(float x, float y, float z, float px, float py, float pz, float m) {
    this(raveJNI.new_RaveVector7D__SWIG_1(x, y, z, px, py, pz, m), true);
  }

  public RaveVector7D(RavePoint3D position, RavePoint3D momentum, float m) {
    this(raveJNI.new_RaveVector7D__SWIG_2(RavePoint3D.getCPtr(position), position, RavePoint3D.getCPtr(momentum), momentum, m), true);
  }

  public float m() {
    return raveJNI.RaveVector7D_m(swigCPtr, this);
  }

  public float energy() {
    return raveJNI.RaveVector7D_energy(swigCPtr, this);
  }

  public RaveVector4D p4() {
    return new RaveVector4D(raveJNI.RaveVector7D_p4(swigCPtr, this), true);
  }

  public void add(RaveVector4D p4) {
    raveJNI.RaveVector7D_add(swigCPtr, this, RaveVector4D.getCPtr(p4), p4);
  }

  public boolean equal(RaveVector7D other) {
    return raveJNI.RaveVector7D_equal(swigCPtr, this, RaveVector7D.getCPtr(other), other);
  }

  public String toString() {
    return raveJNI.RaveVector7D_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RaveVector7D___str__(swigCPtr, this);
  }

}
