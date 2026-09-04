package sh;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.fragment.NavHostFragment;
import bk.c;
import bk.d;
import bk.h;
import bk.l;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.xiaopo.flying.sticker.StickerView;
import com.xw.repo.BubbleSeekBar;
import fl.g0;
import fl.q;
import gl.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.s;
import nh.e;
import nh.f0;
import qh.i;
import qh.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f52423a = r.o(Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK), 360, 480, 540, 640, 720, 1080);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f52424b = r.o(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f));

    public static final File A(Context context, String folderName) {
        s.h(context, "context");
        s.h(folderName, "folderName");
        File file = new File(context.getFilesDir(), folderName);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static final void B(View view, String dimensionRatio) {
        s.h(view, "view");
        s.h(dimensionRatio, "dimensionRatio");
        wp.a.a("Dimension ratio: %s", dimensionRatio);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        s.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.I = dimensionRatio;
        view.setLayoutParams(bVar);
    }

    public static final void C(Context context, StickerView stickerView, boolean z10) {
        s.h(context, "context");
        s.h(stickerView, "stickerView");
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.width_button_icon_setting) / 2.0f;
        bk.b bVar = new bk.b(androidx.core.content.a.getDrawable(context, 2131231718), 0);
        bVar.B(new c());
        bVar.C(dimensionPixelSize);
        bk.b bVar2 = new bk.b(androidx.core.content.a.getDrawable(context, 2131231720), 3);
        bVar2.B(new com.xiaopo.flying.sticker.b());
        bVar2.C(dimensionPixelSize);
        stickerView.setIcons(r.o(bVar, bVar2));
        if (z10) {
            bk.b bVar3 = new bk.b(androidx.core.content.a.getDrawable(context, R.drawable.outline_edit_18), 2);
            bVar3.B(new com.xiaopo.flying.sticker.a());
            bVar3.C(dimensionPixelSize);
            stickerView.setIcons(r.o(bVar, bVar2, bVar3));
        }
        stickerView.setBackgroundColor(0);
        stickerView.E(false);
        stickerView.D(true);
    }

    public static final void D(Context context) {
        s.h(context, "context");
        new AlertDialog.Builder(context).setTitle(R.string.not_enough_space).setMessage(R.string.dialog_msg_not_enough_storage).setPositiveButton(R.string.f22516ok, (DialogInterface.OnClickListener) null).show();
    }

    private static final h E(StickerView stickerView, i iVar) {
        for (h hVar : stickerView.getStickers()) {
            if (s.c(hVar.j(), iVar.getId())) {
                hVar.v(iVar.h());
                stickerView.invalidate();
                return hVar;
            }
        }
        return null;
    }

    public static final d b(StickerView stickerView, qh.c drawableItem) {
        d dVar;
        s.h(stickerView, "stickerView");
        s.h(drawableItem, "drawableItem");
        Context context = stickerView.getContext();
        try {
            s.e(context);
            InputStream inputStreamQ = q(context, drawableItem);
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamQ, null);
                if (drawableItem.h() == null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    InputStream inputStreamQ2 = q(context, drawableItem);
                    try {
                        BitmapFactory.decodeStream(inputStreamQ2, null, options);
                        float f10 = options.outWidth;
                        float f11 = options.outHeight;
                        if (!drawableItem.o()) {
                            float width = f10 / stickerView.getWidth();
                            float height = f11 / stickerView.getHeight();
                            if (width >= height) {
                                if (width > 0.75f) {
                                    float width2 = stickerView.getWidth() * 0.75f;
                                    f11 = (f11 * width2) / f10;
                                    drawableItem.v(width2 / f10);
                                    f10 = width2;
                                }
                            } else if (height > 0.75f) {
                                float height2 = stickerView.getHeight() * 0.75f;
                                float f12 = (height2 * f10) / f11;
                                drawableItem.v(f12 / f10);
                                f11 = height2;
                                f10 = f12;
                            }
                        }
                        dVar = new d(drawableCreateFromStream, vl.a.b(f10), vl.a.b(f11));
                        stickerView.b(dVar);
                        drawableItem.l(dVar.m());
                        drawableItem.y(dVar.p());
                        drawableItem.s(dVar.i());
                        g0 g0Var = g0.f38750a;
                        ql.b.a(inputStreamQ2, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ql.b.a(inputStreamQ2, th2);
                            throw th3;
                        }
                    }
                } else {
                    dVar = new d(drawableCreateFromStream, drawableItem.k(), drawableItem.g());
                    stickerView.d(dVar, drawableItem.h());
                }
                dVar.u(drawableItem.getId());
                wp.a.a("Matrix: %s", drawableItem.h());
                ql.b.a(inputStreamQ, null);
                return dVar;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ql.b.a(inputStreamQ, th4);
                    throw th5;
                }
            }
        } catch (Exception e10) {
            wp.a.b(e10);
            return null;
        }
    }

    public static final h c(StickerView stickerView, i stickerItem, float f10, float f11) {
        s.h(stickerView, "stickerView");
        s.h(stickerItem, "stickerItem");
        e(stickerItem, f10, f11);
        h hVarE = E(stickerView, stickerItem);
        if (hVarE != null) {
            return hVarE;
        }
        if (stickerItem instanceof j) {
            return d(stickerView, (j) stickerItem);
        }
        if (stickerItem instanceof qh.c) {
            return b(stickerView, (qh.c) stickerItem);
        }
        return null;
    }

    public static final l d(StickerView stickerView, j textItem) {
        s.h(stickerView, "stickerView");
        s.h(textItem, "textItem");
        l lVarI = new l(stickerView.getContext(), textItem.d()).G(textItem.u()).H(Typeface.createFromFile(textItem.r().b())).E(textItem.o()).F(textItem.p()).B(textItem.q()).z(textItem.s()).A(textItem.t()).C(textItem.v(), textItem.w()).I();
        s.g(lVarI, "updateViewSize(...)");
        lVarI.u(textItem.getId());
        stickerView.d(lVarI, textItem.h());
        return lVarI;
    }

    public static final void e(i item, float f10, float f11) {
        s.h(item, "item");
        if (item.j() == f10 && item.i() == f11) {
            return;
        }
        float fJ = f10 / item.j();
        float fI = f11 / item.i();
        float f12 = 1000;
        if (vl.a.b(fJ * f12) == vl.a.b(f12 * fI)) {
            Matrix matrixH = item.h();
            if (matrixH != null) {
                matrixH.postScale(fJ, fI);
            }
            wp.a.a("ScaleX and scaleY are equal", new Object[0]);
        } else {
            wp.a.a("ScaleX and scaleY are not equal", new Object[0]);
            float[] fArr = new float[9];
            Matrix matrixH2 = item.h();
            if (matrixH2 != null) {
                matrixH2.getValues(fArr);
            }
            Matrix matrixH3 = item.h();
            if (matrixH3 != null) {
                matrixH3.postScale(fJ, fJ);
            }
            float fJ2 = fArr[2] / item.j();
            float fI2 = fArr[5] / item.i();
            Matrix matrixH4 = item.h();
            if (matrixH4 != null) {
                matrixH4.getValues(fArr);
            }
            float f13 = (fJ2 * f10) - fArr[2];
            float f14 = (fI2 * f11) - fArr[5];
            Matrix matrixH5 = item.h();
            if (matrixH5 != null) {
                matrixH5.postTranslate(f13, f14);
            }
        }
        item.n(f10);
        item.m(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseArray g(List list, int i10, SparseArray array) {
        s.h(array, "array");
        array.clear();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.u();
            }
            int iIntValue = ((Number) obj).intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iIntValue);
            sb2.append('p');
            array.put(i11, sb2.toString());
            i11 = i12;
        }
        return array;
    }

    public static final void h(Context context, BubbleSeekBar seekBar, float f10, float f11, int i10) {
        s.h(context, "context");
        s.h(seekBar, "seekBar");
        seekBar.getConfigBuilder().d(0.0f).c(f10).e(f11).h(i10).s(1).g(1).r(androidx.core.content.a.getColor(context, R.color.grey)).f(androidx.core.content.a.getColor(context, R.color.sunset_orange)).o(androidx.core.content.a.getColor(context, R.color.sunset_orange)).p(7).n().i(androidx.core.content.a.getColor(context, R.color.grey)).k(14).b().m().l().q().j(2).a();
    }

    public static final float i(Context context, float f10) {
        s.h(context, "context");
        return f10 * context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static final void j(Context context, File folder, String folderName, String fileName) throws IOException {
        s.h(context, "context");
        s.h(folder, "folder");
        s.h(folderName, "folderName");
        s.h(fileName, "fileName");
        File file = new File(folder, fileName);
        InputStream inputStreamOpen = context.getAssets().open(folderName + '/' + fileName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                s.e(inputStreamOpen);
                ql.a.a(inputStreamOpen, fileOutputStream, UserVerificationMethods.USER_VERIFY_ALL);
                ql.b.a(fileOutputStream, null);
                ql.b.a(inputStreamOpen, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ql.b.a(inputStreamOpen, th4);
                throw th5;
            }
        }
    }

    public static final long k(long j10, int i10, float f10, float f11) {
        if (j10 <= 0 || i10 <= 0) {
            return 0L;
        }
        return vl.a.d(j10 * ((f10 * f10) / (i10 * i10)) * f11);
    }

    public static final String l() {
        String string = UUID.randomUUID().toString();
        s.g(string, "toString(...)");
        return string;
    }

    public static final List m() {
        return f52424b;
    }

    public static final String n(int i10, int i11, float f10) {
        if (i10 >= i11 * f10) {
            return "H," + i10 + ':' + i11;
        }
        return "W," + i10 + ':' + i11;
    }

    public static final int o(int i10) {
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }

    public static final int p(String type, List videoList, int i10, int i11) {
        int i12;
        int i13;
        s.h(type, "type");
        s.h(videoList, "videoList");
        int iA = ((ng.d) videoList.get(0)).A();
        int iP = ((ng.d) videoList.get(0)).p();
        if (iA <= iP) {
            i13 = i10;
            i12 = (iP * i10) / iA;
        } else {
            i12 = i10;
            i13 = (iA * i10) / iP;
        }
        Iterator it = videoList.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += ((ng.d) it.next()).j();
        }
        return f0.r(type, i13, i12, i11, j10);
    }

    private static final InputStream q(Context context, qh.c cVar) {
        return cVar.o() ? new FileInputStream(cVar.p()) : context.getContentResolver().openInputStream(cVar.r());
    }

    public static final y3.g0 r(androidx.fragment.app.s sVar) {
        androidx.fragment.app.f0 supportFragmentManager;
        NavHostFragment navHostFragment = (NavHostFragment) ((sVar == null || (supportFragmentManager = sVar.getSupportFragmentManager()) == null) ? null : supportFragmentManager.j0(R.id.nav_host_fragment));
        if (navHostFragment != null) {
            return navHostFragment.w();
        }
        return null;
    }

    public static final long s(List videoList, int i10) {
        s.h(videoList, "videoList");
        long jY = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            ng.d dVar = (ng.d) videoList.get(i11);
            jY += dVar.y() - dVar.z();
        }
        return jY;
    }

    public static final q t(List videoList, long j10) {
        s.h(videoList, "videoList");
        ng.d dVar = (ng.d) videoList.get(0);
        Iterator it = videoList.iterator();
        while (it.hasNext()) {
            ng.d dVar2 = (ng.d) it.next();
            long jY = dVar2.y() - dVar2.z();
            if (j10 <= jY) {
                j10 += dVar2.z();
                dVar = dVar2;
                break;
            }
            j10 -= jY;
        }
        return new q(dVar, Long.valueOf(j10));
    }

    public static final List u() {
        return f52423a;
    }

    public static final PointF v(float f10, float f11, float f12, float f13) {
        int i10 = 0;
        float[] fArr = {0.0f, 0.0f, f10, 0.0f, 0.0f, f11, f10, f11};
        float f14 = 2;
        float f15 = f10 / f14;
        float f16 = f11 / f14;
        int iB = nl.c.b(0, 6, 2);
        float f17 = Float.MAX_VALUE;
        float f18 = Float.MAX_VALUE;
        if (iB >= 0) {
            while (true) {
                double d10 = f12;
                int i11 = i10 + 1;
                float fCos = ((((float) Math.cos(d10)) * (fArr[i10] - f15)) - (((float) Math.sin(d10)) * (fArr[i11] - f16))) + f15;
                float fSin = (((float) Math.sin(d10)) * (fArr[i10] - f15)) + (((float) Math.cos(d10)) * (fArr[i11] - f16)) + f16;
                if (f17 > fCos) {
                    f17 = fCos;
                }
                if (f18 > fSin) {
                    f18 = fSin;
                }
                if (i10 == iB) {
                    break;
                }
                i10 += 2;
            }
        }
        return new PointF(f17 * f13, f18 * f13);
    }

    public static final ng.d w(Context context, Uri uri) throws IOException {
        s.h(context, "context");
        s.h(uri, "uri");
        List listO = r.o("_data", CampaignEx.JSON_KEY_TITLE, "duration", "width", "height", "_size");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            listO = r.t0(listO, "bucket_display_name");
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, (String[]) listO.toArray(new String[0]), null, null, null);
        ng.d dVar = null;
        String name = null;
        dVar = null;
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(CampaignEx.JSON_KEY_TITLE));
                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("duration"));
                long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                if (i10 >= 29) {
                    name = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                } else {
                    File parentFile = new File(string).getParentFile();
                    if (parentFile != null) {
                        name = parentFile.getName();
                    }
                }
                String str = name;
                int i11 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("width"));
                int i12 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("height"));
                boolean zY = y(context, uri);
                s.e(string);
                s.e(string2);
                dVar = new ng.d(null, uri, string, str, string2, j10, i11, i12, j11, 0, 0L, 0L, 0L, 0L, 0.0f, null, 0, null, 0, zY, 523777, null);
            }
            cursorQuery.close();
        }
        return dVar;
    }

    public static final long x(List videoList) {
        s.h(videoList, "videoList");
        Iterator it = videoList.iterator();
        long jY = 0;
        while (it.hasNext()) {
            ng.d dVar = (ng.d) it.next();
            jY += dVar.y() - dVar.z();
        }
        return jY;
    }

    public static final boolean y(Context context, Uri uri) throws IOException {
        s.h(context, "context");
        s.h(uri, "uri");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(16);
        mediaMetadataRetriever.release();
        wp.a.a("Has audio in video: %s", Boolean.valueOf(strExtractMetadata != null && s.c(strExtractMetadata, "yes")));
        return strExtractMetadata != null && s.c(strExtractMetadata, "yes");
    }

    public static final boolean z(Context context, lg.a preferenceManager, long j10) {
        s.h(context, "context");
        s.h(preferenceManager, "preferenceManager");
        return new StatFs(preferenceManager.b(R.string.pref_use_internal_storage, true) ? Environment.getExternalStorageDirectory().getAbsolutePath() : e.q(context)).getAvailableBytes() > j10;
    }

    public static final void f(Context context, BubbleSeekBar seekBar, int i10, final List list) {
        s.h(context, "context");
        s.h(seekBar, "seekBar");
        s.h(list, giNWGaNAgVQoO.gvCK);
        int size = list.size();
        h(context, seekBar, size - 1, list.indexOf(Integer.valueOf(i10)), size - 1);
        seekBar.setCustomSectionTextArray(new BubbleSeekBar.j() { // from class: sh.a
            @Override // com.xw.repo.BubbleSeekBar.j
            public final SparseArray a(int i11, SparseArray sparseArray) {
                return b.g(list, i11, sparseArray);
            }
        });
    }
}
