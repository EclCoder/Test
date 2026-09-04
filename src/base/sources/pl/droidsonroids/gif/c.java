package pl.droidsonroids.gif;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public enum c {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(1002, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f50229b;

    c(int i10, String str) {
        this.f50229b = i10;
        this.f50228a = str;
    }

    static c e(int i10) {
        for (c cVar : values()) {
            if (cVar.f50229b == i10) {
                return cVar;
            }
        }
        c cVar2 = UNKNOWN;
        cVar2.f50229b = i10;
        return cVar2;
    }

    String g() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.f50229b), this.f50228a);
    }
}
