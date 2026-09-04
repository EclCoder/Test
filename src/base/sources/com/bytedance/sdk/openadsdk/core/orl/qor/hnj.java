package com.bytedance.sdk.openadsdk.core.orl.qor;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static final Set<String> hnj = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.orl.qor.hnj.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static Set<String> f14145hn = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.orl.qor.hnj.2
        {
            add("application/x-javascript");
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hn {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.orl.qor.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum EnumC0231hnj {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public static Point hnj(Context context, int i10, int i11, hn hnVar) {
        if (context == null) {
            context = oj.hnj();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iHn = sq.hn(context, i10);
        int iHn2 = sq.hn(context, i11);
        if (iHn > width || iHn2 > height) {
            Point point2 = new Point();
            if (hn.HTML_RESOURCE == hnVar) {
                point2.x = Math.min(width, iHn);
                point2.y = Math.min(height, iHn2);
            } else {
                float f10 = iHn;
                float f11 = f10 / width;
                float f12 = iHn2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 >= 0 && point2.y >= 0) {
                point2.x = sq.qor(context, i12);
                point2.y = sq.qor(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
