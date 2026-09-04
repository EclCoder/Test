package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Descriptor(tags = {19, 106, 107, 108, 109, 110, 111, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk$SDKError.b.TPAT_ERROR_VALUE, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128, 129, 130, Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE, Sdk$SDKError.b.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, 134, 135, Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, ModuleDescriptor.MODULE_VERSION, 186, 187, 188, PsExtractor.PRIVATE_STREAM_1, 190, 191, PsExtractor.AUDIO_STREAM, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, Sdk$SDKError.b.AD_IS_LOADING_VALUE, 204, Sdk$SDKError.b.AD_IS_PLAYING_VALUE, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, 211, Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE, Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk$SDKError.b.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk$SDKError.b.AD_RESPONSE_EMPTY_VALUE, Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, Sdk$SDKError.b.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk$SDKError.b.MRAID_JS_COPY_FAILED_VALUE, Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk$SDKError.b.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 224, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk$SDKError.b.INVALID_CSB_DATA_VALUE, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, PsExtractor.VIDEO_STREAM_MASK, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
public class ExtensionDescriptor extends BaseDescriptor {
    private static Logger log = Logger.getLogger(ExtensionDescriptor.class.getName());
    ByteBuffer data;

    static int[] allTags() {
        int[] iArr = new int[148];
        for (int i10 = 106; i10 < 254; i10++) {
            int i11 = i10 - 106;
            log.finest("pos:" + i11);
            iArr[i11] = i10;
        }
        return iArr;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
        return this.data.remaining();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) {
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + this.data.remaining());
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getSize());
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.tag);
        writeSize(byteBufferAllocate, getContentSize());
        byteBufferAllocate.put(this.data.duplicate());
        return byteBufferAllocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public String toString() {
        return "ExtensionDescriptortag=" + this.tag + ",bytes=" + Hex.encodeHex(this.data.array()) + '}';
    }
}
