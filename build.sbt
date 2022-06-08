package com.eon.pm.commons.core

import com.amazon.deequ.VerificationResult
import com.amazon.deequ.checks.CheckResult

object VerificationResultsEnhanced {

  case class SimpleCheckResultOutput(table: String,
                                     constraint: String,
                                     constraintStatus: String,
                                     constraintMessage: String,
                                     column: String,
                                     value: Double)

  /**
    * This methods use verification results and metrics to combine create a usable results
    * @param verificationResult
    * @return Seq(SimpleCheckResultOutput)
    */
  def getSimplifiedCheckResultOutput(verificationResult: VerificationResult) = {

    val selectedCheckResults: Seq[CheckResult] = verificationResult.checkResults
      .values
      .toSeq
    selectedCheckResults.map(check => check.constraintResults.map { constraintResult =>
      SimpleCheckResultOutput(
        check.check.description,
        constraintResult.constraint.toString,
        constraintResult.status.toString,
        constraintResult.message.getOrElse(""),
        constraintResult.metric.get.instance,
        constraintResult.metric.get.value.get.toString.toDouble
      )
    }
    )
  }

}
