package nh;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f47752a = new s();

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Context context, String str, Uri uri) {
        l0.A(context, "grant_permission_storage");
    }

    public final String b(final Context context, Uri uri) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(uri, "uri");
        ContentResolver contentResolver = context.getContentResolver();
        String str = HqKnbV.ngucElfKedJbsw;
        Cursor cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
        if (cursorQuery == null) {
            throw new Exception("Uri " + uri + " could not be found");
        }
        Cursor cursor = cursorQuery;
        try {
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str));
                ql.b.a(cursor, null);
                MediaScannerConnection.scanFile(context, new String[]{string}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: nh.r
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str2, Uri uri2) {
                        s.c(context, str2, uri2);
                    }
                });
                kotlin.jvm.internal.s.e(string);
                return string;
            }
            throw new Exception("Uri " + uri + " could not be found");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.b.a(cursor, th2);
                throw th3;
            }
        }
    }
}
