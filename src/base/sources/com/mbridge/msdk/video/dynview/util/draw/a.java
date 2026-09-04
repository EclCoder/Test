package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f34311d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f34312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f34313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f34314c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0471a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f34315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f34318d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0472a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.video.dynview.shape.a.b f34320a;

            RunnableC0472a(com.mbridge.msdk.video.dynview.shape.a.b bVar) {
                this.f34320a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f34312a == null || this.f34320a.build() == null) {
                    return;
                }
                a.this.f34312a.setBackground(this.f34320a.build());
            }
        }

        RunnableC0471a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f34315a = bitmap;
            this.f34316b = i10;
            this.f34317c = f10;
            this.f34318d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f34315a, 10);
                Bitmap bitmapA2 = a0.a(this.f34315a, 10);
                com.mbridge.msdk.video.dynview.shape.a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f34316b).b(bitmapA).a(bitmapA2);
                if (this.f34316b == 2) {
                    float f10 = this.f34317c;
                    float f11 = this.f34318d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f34318d);
                    } else {
                        bVarA.b(f11).a(this.f34317c);
                    }
                } else {
                    bVarA.b(this.f34317c).a(this.f34318d);
                }
                if (a.this.f34312a != null) {
                    a.this.f34312a.post(new RunnableC0472a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f34312a != null) {
            this.f34312a = null;
        }
        Bitmap bitmap = this.f34313b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f34313b.recycle();
            this.f34313b = null;
        }
        Bitmap bitmap2 = this.f34314c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f34314c.recycle();
        this.f34314c = null;
    }

    public static a a() {
        a aVar;
        if (f34311d != null) {
            return f34311d;
        }
        synchronized (a.class) {
            try {
                if (f34311d == null) {
                    f34311d = new a();
                }
                aVar = f34311d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f34312a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md6 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md6) && map.containsKey(md6)) {
                bitmap = map.get(md6);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap2, bitmap3);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
                try {
                    com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0471a(bitmap, i10, f10, f11));
                } catch (Exception e10) {
                    e = e10;
                    q0.a("ChoiceOneDrawBitBg", e.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
