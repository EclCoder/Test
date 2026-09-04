package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f28608a = {99, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, 242, 107, 111, 197, 48, 1, 103, 43, 254, Sdk$SDKError.b.AD_RESPONSE_EMPTY_VALUE, 171, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 130, 201, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, 250, 89, 71, PsExtractor.VIDEO_STREAM_MASK, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE, 162, 175, 156, 164, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, PsExtractor.AUDIO_STREAM, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 39, 178, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, 9, Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE, 44, 26, 27, 110, 90, 160, 82, 59, Sdk$SDKError.b.INVALID_GZIP_BID_PAYLOAD_VALUE, 179, 41, Sdk$SDKError.b.INVALID_CSB_DATA_VALUE, 47, Sdk$SDKError.b.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 83, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 0, 237, 32, 252, 177, 91, 106, Sdk$SDKError.b.AD_IS_LOADING_VALUE, 190, 57, 74, 76, 88, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, 239, 170, 251, 67, 77, 51, Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, 69, 249, 2, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, Sdk$SDKError.b.MRAID_JS_DOES_NOT_EXIST_VALUE, 33, 16, 255, 243, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, Sdk$SDKError.b.AD_IS_PLAYING_VALUE, 12, 19, 236, 95, 151, 68, 23, 196, 167, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 61, 100, 93, 25, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, 96, 129, 79, Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE, 34, 42, 144, Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, 70, 238, 184, 20, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 94, 11, Sdk$SDKError.b.MRAID_JS_COPY_FAILED_VALUE, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, 172, 98, 145, 149, 228, Sdk$SDKError.b.TPAT_ERROR_VALUE, 231, 200, 55, 109, 141, Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 78, 169, 108, 86, 244, 234, 101, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, 174, 8, 186, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 37, 46, 28, 166, 180, 198, 232, Sdk$SDKError.b.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, 31, 75, PsExtractor.PRIVATE_STREAM_1, 139, 138, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, ModuleDescriptor.MODULE_VERSION, 134, 193, 29, 158, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 248, 152, 17, 105, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, 142, 148, 155, 30, 135, 233, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, 85, 40, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 140, 161, Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[][] f28609b;

    public h(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        JSONArray jSONArray;
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (list.size() <= 0 || list.size() > 2) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
        }
        Object obj2 = list.get(0);
        Object obj3 = list.size() == 2 ? list.get(1) : null;
        String str2 = "[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]";
        if (obj3 instanceof String) {
            try {
                String str3 = (String) obj3;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                jSONArray = new JSONArray(str2);
            } catch (JSONException unused) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
            }
        } else if (obj3 instanceof JSONArray) {
            jSONArray = (JSONArray) obj3;
        } else {
            try {
                jSONArray = new JSONArray("[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
        }
        if (!(obj2 instanceof String)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
        }
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("895")) ? a((String) obj2, (String) obj, jSONArray) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            q0.b("OperatorEncode", e10.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("895")) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, String str2, JSONArray jSONArray) {
        String strA;
        a(str);
        byte[] bArrDecode = Base64.decode(str2, 10);
        byte[] bArr = new byte[16];
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)), 0, bArr, 0, 16);
        } catch (NoSuchAlgorithmException unused) {
        }
        try {
            strA = v0.a(a(bArrDecode, bArr, jSONArray));
        } catch (Exception e10) {
            q0.b("OperatorEncode", e10.getMessage());
            strA = null;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(strA);
    }

    private void a(String str) {
        this.f28609b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i10 = 0; i10 < 16; i10++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i10).getBytes(StandardCharsets.UTF_8)), 0, this.f28609b[i10], 0, 16);
            }
        } catch (Exception e10) {
            q0.b("OperatorEncode", e10.getMessage());
        }
    }

    private byte[] a(byte[] bArr, JSONArray jSONArray) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            String strOptString = jSONObjectOptJSONObject.optString("m");
            strOptString.getClass();
            byte b10 = -1;
            switch (strOptString.hashCode()) {
                case 49:
                    if (strOptString.equals("1")) {
                        b10 = 0;
                    }
                    break;
                case 50:
                    if (strOptString.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                        b10 = 1;
                    }
                    break;
                case 51:
                    if (strOptString.equals("3")) {
                        b10 = 2;
                    }
                    break;
                case 52:
                    if (strOptString.equals("4")) {
                        b10 = 3;
                    }
                    break;
                case 53:
                    if (strOptString.equals(CampaignEx.CLICKMODE_ON)) {
                        b10 = 4;
                    }
                    break;
                case 54:
                    if (strOptString.equals(NhHRaDJCHtCTJR.MbbxTEz)) {
                        b10 = 5;
                    }
                    break;
                case 55:
                    if (strOptString.equals("7")) {
                        b10 = 6;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (strOptString.equals("8")) {
                        b10 = 7;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (strOptString.equals("9")) {
                        b10 = 8;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    byte[] bArr2 = this.f28609b[jSONObjectOptJSONObject.optInt(TtmlNode.TAG_P) % 16];
                    for (int i11 = 0; i11 < 16; i11++) {
                        bArrCopyOf[i11] = (byte) (bArrCopyOf[i11] ^ bArr2[i11]);
                    }
                    break;
                case 1:
                    for (int i12 = 0; i12 < 16; i12++) {
                        bArrCopyOf[i12] = (byte) this.f28608a[bArrCopyOf[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                    }
                    break;
                case 2:
                    int iOptInt = jSONObjectOptJSONObject.optInt(TtmlNode.TAG_P) % 16;
                    if (iOptInt > 0) {
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, 16);
                        for (int i13 = 0; i13 < 16; i13++) {
                            bArrCopyOf[i13] = bArrCopyOf2[(i13 + iOptInt) % 16];
                        }
                    }
                    break;
                case 3:
                    for (int i14 = 0; i14 < 16; i14++) {
                        bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] ^ ((byte) jSONObjectOptJSONObject.optInt(TtmlNode.TAG_P)));
                    }
                    break;
                case 4:
                    for (int i15 = 0; i15 < 16; i15++) {
                        bArrCopyOf[i15] = (byte) (bArrCopyOf[i15] + jSONObjectOptJSONObject.optInt(TtmlNode.TAG_P));
                    }
                    break;
                case 5:
                    int iOptInt2 = jSONObjectOptJSONObject.optInt(TtmlNode.TAG_P) % 8;
                    for (int i16 = 0; i16 < 16; i16++) {
                        int i17 = bArrCopyOf[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        bArrCopyOf[i16] = (byte) ((i17 >>> (8 - iOptInt2)) | (i17 << iOptInt2));
                    }
                    break;
                case 6:
                    int i18 = 0;
                    while (i18 < 16) {
                        int i19 = i18 + 1;
                        bArrCopyOf[i18] = (byte) (bArrCopyOf[i18] ^ bArrCopyOf[i19 % 16]);
                        i18 = i19;
                    }
                    break;
                case 7:
                    int iOptInt3 = jSONObjectOptJSONObject.optInt(TtmlNode.TAG_P) % 16;
                    int i20 = iOptInt3 != 0 ? iOptInt3 : 1;
                    for (int i21 = 0; i21 < 16; i21 += 2) {
                        int i22 = (i21 + i20) % 16;
                        byte b11 = bArrCopyOf[i21];
                        bArrCopyOf[i21] = bArrCopyOf[i22];
                        bArrCopyOf[i22] = b11;
                    }
                    break;
                case 8:
                    int iOptInt4 = ((jSONObjectOptJSONObject.optInt(TtmlNode.TAG_P) % 128) * 2) + 1;
                    for (int i23 = 0; i23 < 16; i23++) {
                        bArrCopyOf[i23] = (byte) (bArrCopyOf[i23] * iOptInt4);
                    }
                    break;
            }
        }
        return bArrCopyOf;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, JSONArray jSONArray) {
        if (bArr2.length == 16) {
            byte[] bArr3 = new byte[bArr.length];
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, 16);
            for (int i10 = 0; i10 < bArr.length; i10 += 16) {
                byte[] bArrA = a(bArrCopyOf, jSONArray);
                int iMin = Math.min(16, bArr.length - i10);
                for (int i11 = 0; i11 < iMin; i11++) {
                    int i12 = i10 + i11;
                    bArr3[i12] = (byte) (bArr[i12] ^ bArrA[i11]);
                }
                for (int i13 = 15; i13 >= 0; i13--) {
                    byte b10 = (byte) (bArrCopyOf[i13] + 1);
                    bArrCopyOf[i13] = b10;
                    if (b10 != 0) {
                        break;
                    }
                }
            }
            return bArr3;
        }
        throw new IllegalArgumentException("IV length must be 16 bytes");
    }
}
