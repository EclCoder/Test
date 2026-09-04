package com.hecorat.screenrecorder.free.videoeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.VideoElementSeekBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import qh.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class VideoElementSeekBar extends View {
    private float A;
    private final Handler B;
    private final Runnable C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f23485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f23486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f23487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f23488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f23489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f23490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f23493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f23494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Path f23497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Rect f23505u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f23506v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private GestureDetector f23507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23508x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f23509y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f23510z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            l lVar;
            wp.a.a("onSingleTapConfirmed", new Object[0]);
            float x10 = motionEvent.getX();
            for (int size = VideoElementSeekBar.this.f23494j.size() - 1; size >= 0; size--) {
                lVar = (l) VideoElementSeekBar.this.f23494j.get(size);
                if (x10 > lVar.b() && x10 < lVar.c()) {
                    VideoElementSeekBar.this.f23506v.d(lVar);
                    return true;
                }
            }
            lVar = null;
            VideoElementSeekBar.this.f23506v.d(lVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void c(l lVar);

        void d(l lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23515d;

        private c() {
        }

        /* JADX WARN: Code duplicated, block: B:102:0x038f  */
        /* JADX WARN: Code duplicated, block: B:76:0x0289  */
        /* JADX WARN: Code duplicated, block: B:78:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:80:0x02ff  */
        /* JADX WARN: Code duplicated, block: B:81:0x0306  */
        /* JADX WARN: Code duplicated, block: B:84:0x030d  */
        /* JADX WARN: Code duplicated, block: B:99:0x036c  */
        /* JADX WARN: Instruction removed from duplicated block: B:78:0x02a5, please report this as an issue */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList;
            l lVar;
            int i10;
            l lVar2;
            int i11;
            this.f23512a = (int) motionEvent.getX();
            this.f23513b = (int) motionEvent.getY();
            if (VideoElementSeekBar.this.f23507w.onTouchEvent(motionEvent)) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23514c = this.f23512a;
                this.f23515d = this.f23513b;
                for (int i12 = 0; i12 < VideoElementSeekBar.this.f23494j.size(); i12++) {
                    l lVar3 = (l) VideoElementSeekBar.this.f23494j.get(i12);
                    int iB = lVar3.b();
                    int iC = lVar3.c();
                    int i13 = this.f23514c;
                    if (i13 >= iB && i13 <= VideoElementSeekBar.this.f23498n + iB) {
                        VideoElementSeekBar.this.f23499o = i12;
                        if (VideoElementSeekBar.this.getParent() != null) {
                            VideoElementSeekBar.this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                    } else if (this.f23514c >= iC - VideoElementSeekBar.this.f23498n && this.f23514c <= iC) {
                        VideoElementSeekBar.this.f23500p = i12;
                        if (VideoElementSeekBar.this.getParent() != null) {
                            VideoElementSeekBar.this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                    } else if (this.f23514c > iB + VideoElementSeekBar.this.f23498n && this.f23514c < iC - VideoElementSeekBar.this.f23498n) {
                        VideoElementSeekBar.this.f23501q = i12;
                        VideoElementSeekBar videoElementSeekBar = VideoElementSeekBar.this;
                        videoElementSeekBar.f23495k = ((l) videoElementSeekBar.f23494j.get(VideoElementSeekBar.this.f23501q)).b();
                        VideoElementSeekBar videoElementSeekBar2 = VideoElementSeekBar.this;
                        videoElementSeekBar2.f23496l = ((l) videoElementSeekBar2.f23494j.get(VideoElementSeekBar.this.f23501q)).c();
                        VideoElementSeekBar.this.B.postDelayed(VideoElementSeekBar.this.C, ViewConfiguration.getLongPressTimeout());
                    }
                }
            } else if (action == 1) {
                VideoElementSeekBar.this.f23508x = false;
                VideoElementSeekBar.this.B.removeCallbacks(VideoElementSeekBar.this.C);
                if (VideoElementSeekBar.this.f23509y) {
                    VideoElementSeekBar.this.f23509y = false;
                    arrayList = new ArrayList(VideoElementSeekBar.this.f23494j);
                    arrayList.remove(VideoElementSeekBar.this.f23501q);
                    lVar = (l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23501q);
                    i10 = (-Collections.binarySearch(arrayList, lVar)) - 2;
                    int i14 = (-Collections.binarySearch(arrayList, lVar, new Comparator() { // from class: com.hecorat.screenrecorder.free.videoeditor.view.a
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return Integer.compare(((l) obj).c(), ((l) obj2).c());
                        }
                    })) - 1;
                    wp.a.a("left index: %s, right index: %s, body index: %s", Integer.valueOf(i10), Integer.valueOf(i14), Integer.valueOf(VideoElementSeekBar.this.f23501q));
                    if (i10 >= 0) {
                        lVar2 = (l) arrayList.get(i10);
                    } else {
                        lVar2 = null;
                    }
                    l lVar4 = i14 < arrayList.size() ? (l) arrayList.get(i14) : null;
                    if ((lVar2 == null && lVar.b() >= lVar2.b() && lVar.b() <= lVar2.c()) || (lVar4 != null && lVar.c() <= lVar4.c() && lVar.c() >= lVar4.b())) {
                        lVar.e(VideoElementSeekBar.this.f23495k);
                        lVar.f(VideoElementSeekBar.this.f23496l);
                    }
                    VideoElementSeekBar.this.f23506v.c(lVar);
                    Collections.sort(VideoElementSeekBar.this.f23494j);
                }
                if (VideoElementSeekBar.this.f23499o != -1) {
                    VideoElementSeekBar.this.f23506v.c((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23499o));
                }
                if (VideoElementSeekBar.this.f23500p != -1) {
                    VideoElementSeekBar.this.f23506v.c((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23500p));
                }
                VideoElementSeekBar.this.f23500p = -1;
                VideoElementSeekBar.this.f23499o = -1;
                VideoElementSeekBar.this.f23501q = -1;
                VideoElementSeekBar.this.invalidate();
            } else if (action == 2) {
                if (VideoElementSeekBar.this.f23508x) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f10 = VideoElementSeekBar.this.f23510z;
                    float f11 = y10 - VideoElementSeekBar.this.A;
                    float f12 = x10 - f10;
                    if (Math.sqrt((f11 * f11) + (f12 * f12)) > 20.0d) {
                        VideoElementSeekBar.this.B.removeCallbacks(VideoElementSeekBar.this.C);
                    }
                } else {
                    VideoElementSeekBar.this.f23508x = true;
                    VideoElementSeekBar.this.f23510z = motionEvent.getX();
                    VideoElementSeekBar.this.A = motionEvent.getY();
                }
                int i15 = this.f23512a - this.f23514c;
                if (VideoElementSeekBar.this.f23509y && i15 != 0 && VideoElementSeekBar.this.f23501q != -1) {
                    if (VideoElementSeekBar.this.getParent() != null) {
                        VideoElementSeekBar.this.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    l lVar5 = (l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23501q);
                    int iB2 = lVar5.b();
                    int iC2 = lVar5.c();
                    int i16 = iB2 + i15;
                    if (i16 < VideoElementSeekBar.this.f23502r) {
                        i16 = VideoElementSeekBar.this.f23502r;
                        i11 = (iC2 - iB2) + i16;
                    } else {
                        int i17 = iC2 + i15;
                        if (i17 > VideoElementSeekBar.this.f23503s) {
                            int i18 = iC2 - iB2;
                            int i19 = VideoElementSeekBar.this.f23503s;
                            i16 = i19 - i18;
                            i11 = i19;
                        } else {
                            i11 = i17;
                        }
                    }
                    lVar5.e(i16);
                    lVar5.f(i11);
                    VideoElementSeekBar.this.invalidate();
                    wp.a.a("Update view", new Object[0]);
                    VideoElementSeekBar videoElementSeekBar3 = VideoElementSeekBar.this;
                    videoElementSeekBar3.getLocalVisibleRect(videoElementSeekBar3.f23505u);
                    if (i11 > VideoElementSeekBar.this.f23505u.right || i16 < VideoElementSeekBar.this.f23505u.left) {
                        ((HorizontalScrollView) VideoElementSeekBar.this.getParent()).scrollBy(i15, 0);
                        wp.a.a("Scroll visible right %s, right %s", Integer.valueOf(VideoElementSeekBar.this.f23505u.right), Integer.valueOf(i11));
                    }
                } else if (VideoElementSeekBar.this.f23499o != -1) {
                    int iC3 = this.f23512a;
                    l lVar6 = (l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23499o);
                    int iC4 = (int) (lVar6.c() - VideoElementSeekBar.this.f23493i);
                    if (iC3 > iC4) {
                        iC3 = iC4;
                    }
                    if (VideoElementSeekBar.this.f23499o == 0 && iC3 < VideoElementSeekBar.this.f23502r) {
                        iC3 = VideoElementSeekBar.this.f23502r;
                    }
                    if (VideoElementSeekBar.this.f23499o >= 1 && iC3 < ((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23499o - 1)).c()) {
                        iC3 = ((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23499o - 1)).c();
                    }
                    lVar6.e(iC3);
                    VideoElementSeekBar.this.invalidate();
                    if (VideoElementSeekBar.this.getParent() != null) {
                        VideoElementSeekBar.this.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                } else if (VideoElementSeekBar.this.f23500p != -1) {
                    int iB3 = this.f23512a;
                    l lVar7 = (l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23500p);
                    int iB4 = (int) (lVar7.b() + VideoElementSeekBar.this.f23493i);
                    if (iB3 < iB4) {
                        iB3 = iB4;
                    }
                    if (VideoElementSeekBar.this.f23500p == VideoElementSeekBar.this.f23494j.size() - 1 && iB3 > VideoElementSeekBar.this.f23503s) {
                        iB3 = VideoElementSeekBar.this.f23503s;
                    }
                    if (VideoElementSeekBar.this.f23500p <= VideoElementSeekBar.this.f23494j.size() - 2 && iB3 > ((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23500p + 1)).b()) {
                        iB3 = ((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23500p + 1)).b();
                    }
                    lVar7.f(iB3);
                    VideoElementSeekBar.this.invalidate();
                    if (VideoElementSeekBar.this.getParent() != null) {
                        VideoElementSeekBar.this.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.f23514c = this.f23512a;
                this.f23515d = this.f23513b;
            } else if (action == 3) {
                VideoElementSeekBar.this.f23508x = false;
                VideoElementSeekBar.this.B.removeCallbacks(VideoElementSeekBar.this.C);
                if (VideoElementSeekBar.this.f23509y) {
                    VideoElementSeekBar.this.f23509y = false;
                    arrayList = new ArrayList(VideoElementSeekBar.this.f23494j);
                    arrayList.remove(VideoElementSeekBar.this.f23501q);
                    lVar = (l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23501q);
                    i10 = (-Collections.binarySearch(arrayList, lVar)) - 2;
                    int i110 = (-Collections.binarySearch(arrayList, lVar, new Comparator() { // from class: com.hecorat.screenrecorder.free.videoeditor.view.a
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return Integer.compare(((l) obj).c(), ((l) obj2).c());
                        }
                    })) - 1;
                    wp.a.a("left index: %s, right index: %s, body index: %s", Integer.valueOf(i10), Integer.valueOf(i110), Integer.valueOf(VideoElementSeekBar.this.f23501q));
                    if (i10 >= 0) {
                        lVar2 = (l) arrayList.get(i10);
                    } else {
                        lVar2 = null;
                    }
                    if (i110 < arrayList.size()) {
                    }
                    if (lVar2 == null) {
                        lVar.e(VideoElementSeekBar.this.f23495k);
                        lVar.f(VideoElementSeekBar.this.f23496l);
                    } else {
                        lVar.e(VideoElementSeekBar.this.f23495k);
                        lVar.f(VideoElementSeekBar.this.f23496l);
                    }
                    VideoElementSeekBar.this.f23506v.c(lVar);
                    Collections.sort(VideoElementSeekBar.this.f23494j);
                }
                if (VideoElementSeekBar.this.f23499o != -1) {
                    VideoElementSeekBar.this.f23506v.c((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23499o));
                }
                if (VideoElementSeekBar.this.f23500p != -1) {
                    VideoElementSeekBar.this.f23506v.c((l) VideoElementSeekBar.this.f23494j.get(VideoElementSeekBar.this.f23500p));
                }
                VideoElementSeekBar.this.f23500p = -1;
                VideoElementSeekBar.this.f23499o = -1;
                VideoElementSeekBar.this.f23501q = -1;
                VideoElementSeekBar.this.invalidate();
            }
            return true;
        }

        /* synthetic */ c(VideoElementSeekBar videoElementSeekBar, a aVar) {
            this();
        }
    }

    public VideoElementSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23499o = -1;
        this.f23500p = -1;
        this.f23501q = -1;
        this.f23505u = new Rect();
        this.f23507w = new GestureDetector(getContext(), new a());
        this.f23508x = false;
        this.f23509y = false;
        this.B = new Handler();
        this.C = new Runnable() { // from class: th.a
            @Override // java.lang.Runnable
            public final void run() {
                VideoElementSeekBar.a(this.f53421a);
            }
        };
        E();
        this.f23494j = new ArrayList();
        this.f23497m = new Path();
        this.f23504t = getResources().getDimensionPixelSize(R.dimen.text_margin);
    }

    private void E() {
        Paint paint = new Paint();
        this.f23485a = paint;
        paint.setColor(getResources().getColor(R.color.sunset_opacity_40));
        Paint paint2 = new Paint();
        this.f23486b = paint2;
        paint2.setColor(getResources().getColor(R.color.sunset_opacity_70));
        Paint paint3 = new Paint();
        this.f23487c = paint3;
        paint3.setColor(getResources().getColor(R.color.sunset_orange));
        Paint paint4 = new Paint();
        this.f23488d = paint4;
        paint4.setColor(getResources().getColor(R.color.red_orange));
        Paint paint5 = new Paint();
        this.f23489e = paint5;
        paint5.setColor(-12303292);
        TextPaint textPaint = new TextPaint();
        this.f23490f = textPaint;
        textPaint.setAntiAlias(true);
        this.f23490f.setTextSize(getResources().getDimensionPixelSize(R.dimen.normal_text_size));
        this.f23490f.setColor(-1);
        this.f23490f.setTextAlign(Paint.Align.LEFT);
        this.f23490f.setLinearText(true);
    }

    public static /* synthetic */ void a(VideoElementSeekBar videoElementSeekBar) {
        videoElementSeekBar.f23509y = true;
        wp.a.a("Long press!", new Object[0]);
        videoElementSeekBar.performHapticFeedback(0);
    }

    public void D(l lVar) {
        int iBinarySearch = Collections.binarySearch(this.f23494j, lVar);
        if (iBinarySearch < 0) {
            this.f23494j.add((-iBinarySearch) - 1, lVar);
        }
        invalidate();
    }

    public void F(String str) {
        for (l lVar : this.f23494j) {
            if (Objects.equals(lVar.getId(), str)) {
                this.f23494j.remove(lVar);
                invalidate();
                return;
            }
        }
    }

    public void G(int i10, int i11, b bVar) {
        int iG = nh.b.g(getContext());
        this.f23492h = i11 + iG;
        this.f23493i = (i11 * 1000.0f) / i10;
        int i12 = iG / 2;
        this.f23502r = i12;
        this.f23503s = i11 + i12;
        this.f23491g = (int) getResources().getDimension(R.dimen.thumb_height);
        this.f23498n = nh.b.a(getContext(), 12);
        setOnTouchListener(new c(this, null));
        this.f23506v = bVar;
    }

    public void H(String str, int i10, int i11) {
        for (l lVar : this.f23494j) {
            if (Objects.equals(lVar.getId(), str)) {
                lVar.e(i10);
                lVar.f(i11);
                invalidate();
                return;
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = 0;
        while (i10 < this.f23494j.size()) {
            l lVar = (l) this.f23494j.get(i10);
            int iB = lVar.b();
            int iC = lVar.c();
            String strD = lVar.d();
            int i11 = this.f23498n;
            canvas.drawRect(iB + i11, 0.0f, iC - i11, this.f23491g, this.f23485a);
            float f10 = 4;
            canvas.drawRoundRect(iB, 0.0f, this.f23498n + iB, this.f23491g, f10, f10, this.f23499o == i10 ? this.f23488d : this.f23487c);
            canvas.drawRoundRect(iC - this.f23498n, 0.0f, iC, this.f23491g, f10, f10, this.f23500p == i10 ? this.f23488d : this.f23487c);
            this.f23497m.rewind();
            this.f23497m.moveTo((this.f23498n + iB) - 6, this.f23491g / 4.0f);
            this.f23497m.lineTo(iB + 6, this.f23491g / 2.0f);
            this.f23497m.lineTo((this.f23498n + iB) - 6, (this.f23491g * 3) / 4.0f);
            this.f23497m.moveTo((iC - this.f23498n) + 6, this.f23491g / 4.0f);
            this.f23497m.lineTo(iC - 6, this.f23491g / 2.0f);
            this.f23497m.lineTo((iC - this.f23498n) + 6, (this.f23491g * 3) / 4.0f);
            canvas.drawPath(this.f23497m, this.f23489e);
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(strD, this.f23490f, ((iC - iB) - (this.f23498n * 2)) - (this.f23504t * 2), TextUtils.TruncateAt.END);
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), iB + this.f23498n + this.f23504t, (int) ((getHeight() / 2) - ((this.f23490f.descent() + this.f23490f.ascent()) / 2.0f)), this.f23490f);
            i10++;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23492h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23491g, 1073741824));
    }
}
