// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package com.scalabigdata.soap.wsdlconsumer

import com.scalabigdata.soap.scalaxb



case class Element(any: scalaxb.DataRecord[Any])



case class Create(sessiontoken: String,
  bandeira: String,
  cpf_hash: String,
  origem: String,
  email: String,
  telefone_celular: String,
  opt_in_email: String,
  opt_in_sms: String)
      


case class CreateResponse(bandeira: String)
      


case class CreateCollection(sessiontoken: String)
      


case class CreateCollectionResponse()
      

