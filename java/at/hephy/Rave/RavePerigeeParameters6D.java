/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RavePerigeeParameters6D extends RavePerigeeParameters5D {
  private long swigCPtr;

  protected RavePerigeeParameters6D(long cPtr, boolean cMemoryOwn) {
    super(raveJNI.RavePerigeeParameters6D_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RavePerigeeParameters6D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RavePerigeeParameters6D(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RavePerigeeParameters6D(float rho, float theta, float phip, float epsilon, float zp, float mass) {
    this(raveJNI.new_RavePerigeeParameters6D__SWIG_0(rho, theta, phip, epsilon, zp, mass), true);
  }

  public RavePerigeeParameters6D(RavePerigeeParameters5D arg0, float mass) {
    this(raveJNI.new_RavePerigeeParameters6D__SWIG_1(RavePerigeeParameters5D.getCPtr(arg0), arg0, mass), true);
  }

  public RavePerigeeParameters6D() {
    this(raveJNI.new_RavePerigeeParameters6D__SWIG_2(), true);
  }

  public float mass() {
    return raveJNI.RavePerigeeParameters6D_mass(swigCPtr, this);
  }

  public float energy() {
    return raveJNI.RavePerigeeParameters6D_energy(swigCPtr, this);
  }

  public boolean equal(RavePerigeeParameters6D other) {
    return raveJNI.RavePerigeeParameters6D_equal(swigCPtr, this, RavePerigeeParameters6D.getCPtr(other), other);
  }

  public String toString() {
    return raveJNI.RavePerigeeParameters6D_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RavePerigeeParameters6D___str__(swigCPtr, this);
  }

}