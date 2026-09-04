package dn;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import cn.c;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(c cVar, Canvas canvas, Paint paint, float f10, en.a imageStore) {
        s.h(cVar, "<this>");
        s.h(canvas, "canvas");
        s.h(paint, "paint");
        s.h(imageStore, "imageStore");
        if (s.c(cVar, c.b.f10144a)) {
            canvas.drawRect(0.0f, 0.0f, f10, f10, paint);
            return;
        }
        c.a aVar = c.a.f10142a;
        if (s.c(cVar, aVar)) {
            aVar.a().h(0.0f, 0.0f, f10, f10);
            canvas.drawOval(new RectF(aVar.a().c(), aVar.a().d(), aVar.a().getWidth(), aVar.a().getHeight()), paint);
        }
    }
}
