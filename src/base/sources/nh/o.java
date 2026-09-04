package nh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.widget.FrameLayout;
import com.hecorat.screenrecorder.free.widget.StickerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static Bitmap a(Bitmap bitmap, ArrayList arrayList) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = 0;
            wp.a.a("Test original size: " + width + "x" + height, new Object[0]);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            wp.a.a("Test sticker size: %s", Integer.valueOf(arrayList.size()));
            int i11 = 0;
            while (i11 < arrayList.size()) {
                StickerView stickerView = (StickerView) arrayList.get(i11);
                Bitmap bitmap2 = stickerView.getBitmap();
                float rotation = stickerView.getRotation();
                FrameLayout frameLayout = (FrameLayout) stickerView.getParent();
                stickerView.setControlItemsHidden(true);
                Rect rect = new Rect();
                stickerView.getHitRect(rect);
                stickerView.getLocationInWindow(new int[2]);
                frameLayout.getLocationInWindow(new int[2]);
                int[] iArr = new int[2];
                iArr[i10] = stickerView.getMeasuredWidth();
                iArr[1] = stickerView.getMeasuredHeight();
                int[] iArr2 = {frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight()};
                int i12 = i10;
                wp.a.a("Test container size: %d, %d", Integer.valueOf(iArr2[i10]), Integer.valueOf(iArr2[1]));
                float f10 = height;
                int i13 = height;
                float f11 = width;
                float fMin = Math.min(iArr2[1] / f10, iArr2[i12] / f11);
                int[] iArr3 = {(int) (f11 * fMin), (int) (f10 * fMin)};
                int i14 = width;
                wp.a.a("Test image size: " + iArr3[i12] + "x" + iArr3[1], new Object[i12]);
                int[] iArr4 = {(iArr2[i12] - iArr3[i12]) / 2, (iArr2[1] - iArr3[1]) / 2};
                wp.a.a("Test image offset: " + iArr4[0] + "x" + iArr4[1], new Object[0]);
                wp.a.a("Test rect's parameter: %s, %s, %s, %s", Integer.valueOf(rect.left), Integer.valueOf(rect.right), Integer.valueOf(rect.top), Integer.valueOf(rect.bottom));
                int[] iArr5 = {((rect.left + rect.right) / 2) - iArr4[0], ((rect.top + rect.bottom) / 2) - iArr4[1]};
                wp.a.a("Test sticker center: " + iArr5[0] + "x" + iArr5[1], new Object[0]);
                int[] offset = stickerView.getOffset();
                int i15 = rect.right - rect.left;
                iArr[0] = i15;
                iArr[1] = rect.bottom - rect.top;
                wp.a.a("Test sticker size: %d, %d, and offset = %d, %d", Integer.valueOf(i15), Integer.valueOf(iArr[1]), Integer.valueOf(offset[0]), Integer.valueOf(offset[1]));
                int[] iArr6 = {(rect.left + offset[0]) - iArr4[0], (rect.top + offset[1]) - iArr4[1]};
                wp.a.a("Test sticker real location: %d, %d", Integer.valueOf(iArr6[0]), Integer.valueOf(iArr6[1]));
                wp.a.a("Test rotation: %s", Float.valueOf(rotation));
                wp.a.a("Test translate: " + (iArr6[0] / fMin) + "x" + (iArr6[1] / fMin), new Object[0]);
                wp.a.a("Test logo size: " + bitmap2.getWidth() + "x" + bitmap2.getHeight(), new Object[0]);
                Matrix matrix = new Matrix();
                matrix.postRotate(rotation, ((float) bitmap2.getWidth()) / 2.0f, ((float) bitmap2.getHeight()) / 2.0f);
                float f12 = 1.0f / fMin;
                matrix.postScale(f12, f12);
                matrix.postTranslate(((float) (iArr5[0] - (bitmap2.getWidth() / 2))) / fMin, ((float) (iArr5[1] - (bitmap2.getHeight() / 2))) / fMin);
                canvas.drawBitmap(bitmap2, matrix, null);
                i11++;
                height = i13;
                i10 = 0;
                width = i14;
            }
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            return null;
        }
    }

    public static Bitmap b(Context context, Bitmap bitmap, float f10) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(f10);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            return null;
        }
    }

    public static Bitmap c(Bitmap bitmap) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            wp.a.a("Test width and height: " + width + ", " + height, new Object[0]);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            return null;
        }
    }
}
