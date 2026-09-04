package rh;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.hecorat.screenrecorder.free.R;
import java.util.ArrayList;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f51338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        s.h(context, "context");
        this.f51338d = context;
    }

    @Override // rh.g
    protected ng.c c(Cursor cursor, Uri contentUri, String path, String str, String title, long j10) {
        s.h(cursor, "cursor");
        s.h(contentUri, "contentUri");
        s.h(path, "path");
        s.h(title, "title");
        long j11 = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
        if (Build.VERSION.SDK_INT >= 29) {
            contentUri = MediaStore.Audio.Media.getContentUri(cursor.getString(cursor.getColumnIndexOrThrow("volume_name")));
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(contentUri, j10);
        s.g(uriWithAppendedId, "withAppendedId(...)");
        return new ng.a(uriWithAppendedId, path, str, title, j11, false, 32, null);
    }

    @Override // rh.g
    protected String d() {
        String string = this.f51338d.getString(R.string.all_audio);
        s.g(string, "getString(...)");
        return string;
    }

    @Override // rh.g
    protected Uri f() {
        Uri EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        s.g(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }

    @Override // rh.g
    protected String[] h() {
        return new String[]{"%.mp3", "%.m4a"};
    }

    @Override // rh.g
    protected String i() {
        return "_data LIKE ? OR _data LIKE ?";
    }

    @Override // rh.g
    protected void l(ArrayList projectionList) {
        s.h(projectionList, "projectionList");
        projectionList.add("duration");
    }
}
