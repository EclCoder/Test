package mf;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public final void a(Context context, ng.d video, int i10, int i11, Function1 updateList) {
        int i12;
        Bitmap bitmapCreateBitmap;
        s.h(context, "context");
        s.h(video, "video");
        s.h(updateList, "updateList");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(context, video.b());
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            s.e(strExtractMetadata);
            int i13 = Integer.parseInt(strExtractMetadata);
            ArrayList arrayList = new ArrayList();
            int i14 = i13 / 7;
            int i15 = 0;
            while (i15 < 8) {
                int i16 = i15 < 7 ? i10 / 8 : i10 - ((i10 / 8) * 7);
                long j10 = i15 * i14;
                try {
                    if (Build.VERSION.SDK_INT < 27) {
                        bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10 * ((long) 1000), 2);
                        i12 = i11;
                    } else {
                        i12 = i11;
                        try {
                            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10 * ((long) 1000), 2, i16, i12);
                        } catch (Exception e10) {
                            e = e10;
                            wp.a.e(e);
                            com.google.firebase.crashlytics.a.b().d(e);
                            bitmapCreateBitmap = null;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    i12 = i11;
                }
                if (bitmapCreateBitmap == null) {
                    if (arrayList.size() > 0) {
                        bitmapCreateBitmap = (Bitmap) arrayList.get(arrayList.size() - 1);
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(i16, i12, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.eraseColor(-16777216);
                    }
                }
                s.e(bitmapCreateBitmap);
                arrayList.add(Bitmap.createScaledBitmap(bitmapCreateBitmap, i16, i12, false));
                updateList.invoke(arrayList);
                i15++;
            }
        } catch (Exception e12) {
            wp.a.e(e12);
            com.google.firebase.crashlytics.a.b().d(e12);
        }
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e13) {
            e13.printStackTrace();
        }
    }
}
