package br.com.zup.ot4.keymanager.search

import br.com.zup.ot4.KeyType
import br.com.zup.ot4.SearchKeyResponse
import java.time.LocalDateTime
import java.time.ZoneOffset

data class PixKeyDetailsResponse(
    val pixId: String,
    val clientId: String,
    val keyType: KeyType,
    val key: String,
    val ownerName: String,
    val accountData: AccountDataResponse,
    val createdAt: String
) {


}