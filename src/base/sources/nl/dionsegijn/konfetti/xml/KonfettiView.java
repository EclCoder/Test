package nl.dionsegijn.konfetti.xml;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import cn.b;
import cn.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lnl/dionsegijn/konfetti/xml/KonfettiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lan/a;", "Landroid/graphics/Canvas;", "canvas", "Lfl/g0;", "a", "(Lan/a;Landroid/graphics/Canvas;)V", "Lan/b;", "party", "c", "(Lan/b;)Lan/b;", "", "Lan/c;", "getActiveSystems", "()Ljava/util/List;", "onDraw", "(Landroid/graphics/Canvas;)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Ljava/util/List;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Ljava/util/List;", "systems", "Lnl/dionsegijn/konfetti/xml/KonfettiView$a;", "Lnl/dionsegijn/konfetti/xml/KonfettiView$a;", "timer", "Lcn/b;", "Lcn/b;", "drawArea", "Len/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Len/a;", "imageStore", "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "paint", "Lfn/a;", "onParticleSystemUpdateListener", "Lfn/a;", "getOnParticleSystemUpdateListener", "()Lfn/a;", "setOnParticleSystemUpdateListener", "(Lfn/a;)V", "xml_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class KonfettiView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List systems;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a timer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b drawArea;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final en.a imageStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f47826a = -1;

        public final float a() {
            if (this.f47826a == -1) {
                this.f47826a = System.nanoTime();
            }
            long jNanoTime = System.nanoTime();
            float f10 = (jNanoTime - this.f47826a) / 1000000.0f;
            this.f47826a = jNanoTime;
            return f10 / 1000;
        }

        public final long b(long j10) {
            return System.currentTimeMillis() - j10;
        }

        public final void c() {
            this.f47826a = -1L;
        }
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.systems = new ArrayList();
        this.timer = new a();
        this.drawArea = new b(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.imageStore = new en.a();
        this.paint = new Paint();
    }

    private final void a(an.a aVar, Canvas canvas) {
        this.paint.setColor(aVar.a());
        float f10 = 2;
        float fC = (aVar.c() * aVar.e()) / f10;
        int iSave = canvas.save();
        canvas.translate(aVar.f() - fC, aVar.g());
        canvas.rotate(aVar.b(), fC, aVar.e() / f10);
        canvas.scale(aVar.c(), 1.0f);
        dn.a.a(aVar.d(), canvas, this.paint, aVar.e(), this.imageStore);
        canvas.restoreToCount(iSave);
    }

    private final an.b c(an.b party) {
        List listL = party.l();
        ArrayList arrayList = new ArrayList(r.v(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add((c) it.next());
        }
        return party.a((16255 & 1) != 0 ? party.f466a : 0, (16255 & 2) != 0 ? party.f467b : 0, (16255 & 4) != 0 ? party.f468c : 0.0f, (16255 & 8) != 0 ? party.f469d : 0.0f, (16255 & 16) != 0 ? party.f470e : 0.0f, (16255 & 32) != 0 ? party.f471f : null, (16255 & 64) != 0 ? party.f472g : null, (16255 & 128) != 0 ? party.f473h : arrayList, (16255 & 256) != 0 ? party.f474i : 0L, (16255 & 512) != 0 ? party.f475j : false, (16255 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? party.f476k : null, (16255 & 2048) != 0 ? party.f477l : 0, (16255 & 4096) != 0 ? party.f478m : null, (16255 & 8192) != 0 ? party.f479n : null);
    }

    public final void b(List party) {
        s.h(party, "party");
        List list = this.systems;
        List<an.b> list2 = party;
        ArrayList arrayList = new ArrayList(r.v(list2, 10));
        for (an.b bVar : list2) {
            c(bVar);
            arrayList.add(new an.c(c(bVar), 0L, Resources.getSystem().getDisplayMetrics().density, 2, null));
        }
        list.addAll(arrayList);
        invalidate();
    }

    public final List<an.c> getActiveSystems() {
        return this.systems;
    }

    public final fn.a getOnParticleSystemUpdateListener() {
        return null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.h(canvas, "canvas");
        super.onDraw(canvas);
        float fA = this.timer.a();
        int size = this.systems.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            an.c cVar = (an.c) this.systems.get(size);
            if (this.timer.b(cVar.a()) >= cVar.b().f()) {
                Iterator it = cVar.d(fA, this.drawArea).iterator();
                while (it.hasNext()) {
                    a((an.a) it.next(), canvas);
                }
            }
            if (cVar.c()) {
                this.systems.remove(size);
            }
        }
        if (this.systems.size() != 0) {
            invalidate();
        } else {
            this.timer.c();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        this.drawArea = new b(0.0f, 0.0f, w10, h10);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int visibility) {
        s.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        this.timer.c();
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.systems = new ArrayList();
        this.timer = new a();
        this.drawArea = new b(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.imageStore = new en.a();
        this.paint = new Paint();
    }

    public final void setOnParticleSystemUpdateListener(fn.a aVar) {
    }
}
