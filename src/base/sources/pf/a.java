package pf;

import android.os.Environment;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f50026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f50027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f50028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f50029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f50030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f50031f;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
        String str = File.separator;
        sb2.append(str);
        sb2.append("AzScreenRecorder");
        String string = sb2.toString();
        f50026a = string;
        f50027b = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + str + "AzScreenRecorder";
        f50028c = string + str + "AzDownloadedAudio";
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        f50029d = absolutePath;
        f50030e = absolutePath + str + "AzRecorderFree";
        f50031f = MBridgeConstans.API_REUQEST_CATEGORY_APP;
    }
}
