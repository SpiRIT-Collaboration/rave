/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveKVirtualParticle extends RaveKParticle {
  private long swigCPtr;

  protected RaveKVirtualParticle(long cPtr, boolean cMemoryOwn) {
    super(raveJNI.RaveKVirtualParticle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveKVirtualParticle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveKVirtualParticle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RaveKVirtualParticle() {
    this(raveJNI.new_RaveKVirtualParticle(), true);
  }

}