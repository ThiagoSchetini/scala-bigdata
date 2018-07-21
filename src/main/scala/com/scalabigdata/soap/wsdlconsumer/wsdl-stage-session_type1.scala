// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package com.scalabigdata.soap.wsdlconsumer

import com.scalabigdata.soap.scalaxb
import com.scalabigdata.soap.wsdlconsumer



case class ElementType(any: scalaxb.DataRecord[Any])
      


case class NewInstance(sessiontoken: String,
  entity: wsdlconsumer.ElementType)
      


case class Duplicate(sessiontoken: String,
  entity: wsdlconsumer.ElementType,
  pkPk: String)
      


case class DuplicateWithMappingId(sessiontoken: String,
  entity: wsdlconsumer.ElementType,
  pkPk: String)
      


case class DuplicateTo(sessiontoken: String,
  entity: wsdlconsumer.ElementType,
  pkPk: String,
  pkFolder: String)
      


case class ApplyDuplicateRules(sessiontoken: String,
  entity: wsdlconsumer.ElementType)
      


case class SetDefaults(sessiontoken: String,
  entity: wsdlconsumer.ElementType)
      


case class SetDefaultValues(sessiontoken: String,
  entity: wsdlconsumer.ElementType,
  strXpath: String)
      


case class Load(sessiontoken: String,
  entity: wsdlconsumer.ElementType,
  pkPk: String)
      


case class LoadIfExists(sessiontoken: String,
  entity: wsdlconsumer.ElementType,
  pkPk: String)
      


case class LoadAsText(sessiontoken: String,
  pkPk: String)
      


case class LoadAsTextResponse(pstrContent: String)
      


case class Remove(sessiontoken: String,
  entity: String)
      


case class GetPkList(sessiontoken: String,
  entity: String)
      


case class GetPkListResponse(ppklPkList: String)
      


case class Write(sessiontoken: String,
  domDoc: wsdlconsumer.ElementType)
      


case class WriteResponse()
      


case class WriteCollection(sessiontoken: String,
  domDoc: wsdlconsumer.ElementType)
      


case class WriteCollectionResponse()
      


case class DeleteCollection(sessiontoken: String,
  strSchema: String,
  elemWhere: wsdlconsumer.ElementType,
  bIgnoreDeleteStatus: Boolean)
      


case class DeleteCollectionResponse()
      


case class ImportCollection(sessiontoken: String,
  domDoc: wsdlconsumer.ElementType)
      


case class ImportCollectionResponse()
      


case class GetImages(sessiontoken: String,
  strPkList: String)
      


case class GetImagesResponse(pdomDoc: wsdlconsumer.ElementType)
      


case class GetEntityIfMoreRecent(sessiontoken: String,
  strPk: String,
  strMd5: String,
  bMustExist: Boolean)
      


case class GetEntityIfMoreRecentResponse(pdomDoc: wsdlconsumer.ElementType)
      


case class GetDirtyCacheEntities(sessiontoken: String,
  domCacheEntities: wsdlconsumer.ElementType)
      


case class GetDirtyCacheEntitiesResponse(pdomDirtyEntities: wsdlconsumer.ElementType)
      


case class GetActiveApplicationMenus(sessiontoken: String)
      


case class GetActiveApplicationMenusResponse(pdomDoc: wsdlconsumer.ElementType)
      


case class GetDefaultEntity(sessiontoken: String,
  strSchema: String)
      


case class GetDefaultEntityResponse(pdomDoc: wsdlconsumer.ElementType)
      


case class Logon(sessiontoken: String,
  strLogin: String,
  strPassword: String,
  elemParameters: wsdlconsumer.ElementType)
      


case class LogonResponse(pstrSessionToken: String,
  pSessionInfo: wsdlconsumer.ElementType,
  pstrSecurityToken: String)
      


case class BearerTokenLogon(sessiontoken: String,
  strBearerToken: String)
      


case class BearerTokenLogonResponse(pstrSessionToken: String,
  pSessionInfo: wsdlconsumer.ElementType,
  pstrSecurityToken: String)
      


case class GetUserInfo(sessiontoken: String)
      


case class GetUserInfoResponse(pUserInfo: wsdlconsumer.ElementType)
      


case class Logoff(sessiontoken: String)
      


case class LogoffResponse()
      


case class KillSession(sessiontoken: String,
  strId: String)
      


case class KillSessionResponse()
      


case class TestCnx(sessiontoken: String)
      


case class TestCnxResponse()
      


case class ChangePassword(sessiontoken: String,
  strOldPassword: String,
  strNewPassword: String)
      


case class ChangePasswordResponse()
      


case class GetServerTime(sessiontoken: String)
      


case class GetServerTimeResponse(ptmServerTime: Option[javax.xml.datatype.XMLGregorianCalendar] = None)
      


case class ServerShutdown(sessiontoken: String)
      


case class ServerShutdownResponse()
      


case class GetOption(sessiontoken: String,
  strName: String)
      


case class GetOptionResponse(pstrValue: String,
  pbtType: Byte)
      


case class GetNewIds(sessiontoken: String,
  lCount: Int)
      


case class GetNewIdsResponse(pstrIdList: String)
      


case class GetNewIdsEx(sessiontoken: String,
  lCount: Int,
  strSequence: String)
      


case class GetNewIdsExResponse(pstrIdList: String)
      


case class GetCnxInfo(sessiontoken: String)
      


case class GetCnxInfoResponse(pdomCnxInfo: wsdlconsumer.ElementType)
      


case class FormatDataPolicy(sessiontoken: String,
  strDataPolicy: String,
  strValue: String)
      


case class FormatDataPolicyResponse(pstrResult: String)
      


case class Encrypt(sessiontoken: String,
  strDecrypted: String)
      


case class EncryptResponse(pstrEncrypted: String)
      


case class EncryptServerPassword(sessiontoken: String,
  strDecrypted: String)
      


case class EncryptServerPasswordResponse(pstrEncrypted: String)
      


case class HashPassword(sessiontoken: String,
  strDecrypted: String)
      


case class HashPasswordResponse(pstrEncrypted: String)
      


case class Diff(sessiontoken: String,
  pkPk: String)
      


case class DiffResponse(pstrOriginal: String,
  pstrCurrent: String)
      
