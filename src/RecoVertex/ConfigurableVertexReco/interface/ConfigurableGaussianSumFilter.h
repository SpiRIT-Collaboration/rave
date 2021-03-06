#ifndef _ConfigurableGaussianSumFilter_H_
#define _ConfigurableGaussianSumFilter_H_

#include "RecoVertex/ConfigurableVertexReco/interface/AbstractConfFitter.h"

/**
 *  Wrap any VertexFitter into the VertexReconstructor interface
 */

class ConfigurableGaussianSumFilter : public AbstractConfFitter
{
  public:
    /**
     *  Values that are respected:
     *  sigmacut: The sqrt(chi2_cut) criterion. Default: 3.0
     *  ratio:   The annealing ratio. Default: 0.25
     *  Tini:    The initial temparature. Default: 256
     */
    ConfigurableGaussianSumFilter ();
    void configure ( const edm::ParameterSet & );
    ConfigurableGaussianSumFilter ( const ConfigurableGaussianSumFilter & o );
    ~ConfigurableGaussianSumFilter();
    ConfigurableGaussianSumFilter * clone () const;
    edm::ParameterSet defaults() const;
};

#endif
