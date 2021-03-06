/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveKParticleContainer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveKParticleContainer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveKParticleContainer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveKParticleContainer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RaveKParticleContainer() {
    this(raveJNI.new_RaveKParticleContainer__SWIG_0(), true);
  }

  public RaveKParticleContainer(long n) {
    this(raveJNI.new_RaveKParticleContainer__SWIG_1(n), true);
  }

  public long size() {
    return raveJNI.RaveKParticleContainer_size(swigCPtr, this);
  }

  public long capacity() {
    return raveJNI.RaveKParticleContainer_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    raveJNI.RaveKParticleContainer_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return raveJNI.RaveKParticleContainer_isEmpty(swigCPtr, this);
  }

  public void clear() {
    raveJNI.RaveKParticleContainer_clear(swigCPtr, this);
  }

  public void add(RaveKParticle x) {
    raveJNI.RaveKParticleContainer_add(swigCPtr, this, RaveKParticle.getCPtr(x), x);
  }

  public RaveKParticle get(int i) {
    return new RaveKParticle(raveJNI.RaveKParticleContainer_get(swigCPtr, this, i), false);
  }

  public void set(int i, RaveKParticle val) {
    raveJNI.RaveKParticleContainer_set(swigCPtr, this, i, RaveKParticle.getCPtr(val), val);
  }

}
