package s5;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static boolean a(Uri uri) {
        if (!d(uri)) {
            return false;
        }
        for (String str : uri.getPathSegments()) {
            if (str != null && str.startsWith("picker")) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Uri uri) {
        return d(uri) && !g(uri);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }

    public static boolean d(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return d(uri) && g(uri);
    }

    public static boolean f(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    private static boolean g(Uri uri) {
        return uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
    }

    public static AssetFileDescriptor h(Uri uri, ContentResolver contentResolver) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, CampaignEx.JSON_KEY_AD_R, null);
    }
}
