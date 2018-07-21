// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package com.scalabigdata.soap.wsdlconsumer

import scala.concurrent.Future

import com.scalabigdata.soap.scalaxb
import com.scalabigdata.soap.wsdlconsumer


trait SessionMethodsSoap {
  def newInstance(sessiontoken: String, entity: wsdlconsumer.ElementType): Future[scalaxb.DataRecord[Any]]
  def duplicate(sessiontoken: String, entity: wsdlconsumer.ElementType, pkPk: String): Future[scalaxb.DataRecord[Any]]
  def duplicateWithMappingId(sessiontoken: String, entity: wsdlconsumer.ElementType, pkPk: String): Future[scalaxb.DataRecord[Any]]
  def duplicateTo(sessiontoken: String, entity: wsdlconsumer.ElementType, pkPk: String, pkFolder: String): Future[scalaxb.DataRecord[Any]]
  def applyDuplicateRules(sessiontoken: String, entity: wsdlconsumer.ElementType): Future[scalaxb.DataRecord[Any]]
  def setDefaults(sessiontoken: String, entity: wsdlconsumer.ElementType): Future[scalaxb.DataRecord[Any]]
  def setDefaultValues(sessiontoken: String, entity: wsdlconsumer.ElementType, strXpath: String): Future[scalaxb.DataRecord[Any]]
  def load(sessiontoken: String, entity: wsdlconsumer.ElementType, pkPk: String): Future[scalaxb.DataRecord[Any]]
  def loadIfExists(sessiontoken: String, entity: wsdlconsumer.ElementType, pkPk: String): Future[scalaxb.DataRecord[Any]]
  def loadAsText(sessiontoken: String, pkPk: String): Future[String]
  def remove(sessiontoken: String, entity: String): Future[scalaxb.DataRecord[Any]]
  def getPkList(sessiontoken: String, entity: String): Future[String]
  def write(sessiontoken: String, domDoc: wsdlconsumer.ElementType): Future[wsdlconsumer.WriteResponse]
  def writeCollection(sessiontoken: String, domDoc: wsdlconsumer.ElementType): Future[wsdlconsumer.WriteCollectionResponse]
  def deleteCollection(sessiontoken: String, strSchema: String, elemWhere: wsdlconsumer.ElementType, bIgnoreDeleteStatus: Boolean): Future[wsdlconsumer.DeleteCollectionResponse]
  def importCollection(sessiontoken: String, domDoc: wsdlconsumer.ElementType): Future[wsdlconsumer.ImportCollectionResponse]
  def getImages(sessiontoken: String, strPkList: String): Future[wsdlconsumer.ElementType]
  def getEntityIfMoreRecent(sessiontoken: String, strPk: String, strMd5: String, bMustExist: Boolean): Future[wsdlconsumer.ElementType]
  def getDirtyCacheEntities(sessiontoken: String, domCacheEntities: wsdlconsumer.ElementType): Future[wsdlconsumer.ElementType]
  def getActiveApplicationMenus(sessiontoken: String): Future[wsdlconsumer.ElementType]
  def getDefaultEntity(sessiontoken: String, strSchema: String): Future[wsdlconsumer.ElementType]
  def logon(sessiontoken: String, strLogin: String, strPassword: String, elemParameters: wsdlconsumer.ElementType): Future[wsdlconsumer.LogonResponse]
  def bearerTokenLogon(sessiontoken: String, strBearerToken: String): Future[wsdlconsumer.BearerTokenLogonResponse]
  def getUserInfo(sessiontoken: String): Future[wsdlconsumer.ElementType]
  def logoff(sessiontoken: String): Future[wsdlconsumer.LogoffResponse]
  def killSession(sessiontoken: String, strId: String): Future[wsdlconsumer.KillSessionResponse]
  def testCnx(sessiontoken: String): Future[wsdlconsumer.TestCnxResponse]
  def changePassword(sessiontoken: String, strOldPassword: String, strNewPassword: String): Future[wsdlconsumer.ChangePasswordResponse]
  def getServerTime(sessiontoken: String): Future[Option[javax.xml.datatype.XMLGregorianCalendar]]
  def serverShutdown(sessiontoken: String): Future[wsdlconsumer.ServerShutdownResponse]
  def getOption(sessiontoken: String, strName: String): Future[wsdlconsumer.GetOptionResponse]
  def getNewIds(sessiontoken: String, lCount: Int): Future[String]
  def getNewIdsEx(sessiontoken: String, lCount: Int, strSequence: String): Future[String]
  def getCnxInfo(sessiontoken: String): Future[wsdlconsumer.ElementType]
  def formatDataPolicy(sessiontoken: String, strDataPolicy: String, strValue: String): Future[String]
  def encrypt(sessiontoken: String, strDecrypted: String): Future[String]
  def encryptServerPassword(sessiontoken: String, strDecrypted: String): Future[String]
  def hashPassword(sessiontoken: String, strDecrypted: String): Future[String]
  def diff(sessiontoken: String, pkPk: String): Future[wsdlconsumer.DiffResponse]
}




