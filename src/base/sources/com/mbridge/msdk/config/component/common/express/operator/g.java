package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f28606a = {99, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, 242, 107, 111, 197, 48, 1, 103, 43, 254, Sdk$SDKError.b.AD_RESPONSE_EMPTY_VALUE, 171, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 130, 201, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, 250, 89, 71, PsExtractor.VIDEO_STREAM_MASK, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE, 162, 175, 156, 164, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, PsExtractor.AUDIO_STREAM, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 39, 178, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, 9, Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE, 44, 26, 27, 110, 90, 160, 82, 59, Sdk$SDKError.b.INVALID_GZIP_BID_PAYLOAD_VALUE, 179, 41, Sdk$SDKError.b.INVALID_CSB_DATA_VALUE, 47, Sdk$SDKError.b.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 83, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 0, 237, 32, 252, 177, 91, 106, Sdk$SDKError.b.AD_IS_LOADING_VALUE, 190, 57, 74, 76, 88, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, 239, 170, 251, 67, 77, 51, Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, 69, 249, 2, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, Sdk$SDKError.b.MRAID_JS_DOES_NOT_EXIST_VALUE, 33, 16, 255, 243, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, Sdk$SDKError.b.AD_IS_PLAYING_VALUE, 12, 19, 236, 95, 151, 68, 23, 196, 167, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 61, 100, 93, 25, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, 96, 129, 79, Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE, 34, 42, 144, Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, 70, 238, 184, 20, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 94, 11, Sdk$SDKError.b.MRAID_JS_COPY_FAILED_VALUE, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, 172, 98, 145, 149, 228, Sdk$SDKError.b.TPAT_ERROR_VALUE, 231, 200, 55, 109, 141, Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 78, 169, 108, 86, 244, 234, 101, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, 174, 8, 186, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 37, 46, 28, 166, 180, 198, 232, Sdk$SDKError.b.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, 31, 75, PsExtractor.PRIVATE_STREAM_1, 139, 138, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, ModuleDescriptor.MODULE_VERSION, 134, 193, 29, 158, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 248, 152, 17, 105, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, 142, 148, 155, 30, 135, 233, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, 85, 40, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 140, 161, Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[][] f28607b;

    public g(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("886"))) {
                return a(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("887"))) {
                return f(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("888"))) {
                return e(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("889"))) {
                return h(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("890"))) {
                return b(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("891"))) {
                return c(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("892"))) {
                return i(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("893"))) {
                return g(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"))) {
                return d(obj, list);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        } catch (Exception unused) {
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = Integer.parseInt(list.get(0).toString()) % 8;
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = bArrDecode[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            bArrDecode[i11] = (byte) ((i12 >>> (8 - i10)) | (i12 << i10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = ((Integer.parseInt(list.get(0).toString()) % 128) * 2) + 1;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrDecode[i11] = (byte) (bArrDecode[i11] * i10);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = Integer.parseInt(list.get(0).toString()) % 16;
        if (i10 > 0) {
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, 16);
            for (int i11 = 0; i11 < 16; i11++) {
                bArrDecode[i11] = bArrCopyOf[(i11 + i10) % 16];
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            bArrDecode[i10] = (byte) this.f28606a[bArrDecode[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null) {
            if (list.size() == 1) {
                byte[] bArrDecode = Base64.decode(obj.toString(), 10);
                if (bArrDecode.length < 16) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
                }
                if (bArrDecode.length > 16) {
                    bArrDecode = Arrays.copyOf(bArrDecode, 16);
                }
                int i10 = Integer.parseInt(list.get(0).toString()) % 16;
                int i11 = i10 != 0 ? i10 : 1;
                for (int i12 = 0; i12 < 16; i12 += 2) {
                    int i13 = (i12 + i11) % 16;
                    byte b10 = bArrDecode[i12];
                    bArrDecode[i12] = bArrDecode[i13];
                    bArrDecode[i13] = b10;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            bArrDecode[i10] = (byte) (bArrDecode[i10] ^ ((byte) Integer.parseInt(list.get(0).toString())));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a i(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            bArrDecode[i10] = (byte) (bArrDecode[i10] ^ bArrDecode[i11 % 16]);
            i10 = i11;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return b(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private void a(String str) {
        this.f28607b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i10 = 0; i10 < 16; i10++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i10).getBytes(StandardCharsets.UTF_8)), 0, this.f28607b[i10], 0, 16);
            }
        } catch (Exception e10) {
            q0.b("OperatorEnMethod", e10.getMessage());
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            String string = obj.toString();
            byte[] bArrDecode = Base64.decode(string, 10);
            if (bArrDecode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            a(string);
            byte[] bArr = this.f28607b[Integer.parseInt(list.get(0).toString()) % 16];
            for (int i10 = 0; i10 < 16; i10++) {
                bArrDecode[i10] = (byte) (bArrDecode[i10] ^ bArr[i10]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            byte[] bArrDecode = Base64.decode(obj.toString(), 10);
            if (bArrDecode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            for (int i10 = 0; i10 < 16; i10++) {
                bArrDecode[i10] = (byte) (bArrDecode[i10] + Integer.parseInt(list.get(0).toString()));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("886")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("887")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("888")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("889")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("890")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("891")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("892")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("893")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"));
    }
}
