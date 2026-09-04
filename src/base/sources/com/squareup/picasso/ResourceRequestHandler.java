package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class ResourceRequestHandler extends RequestHandler {
    private final Context context;

    ResourceRequestHandler(Context context) {
        this.context = context;
    }

    private static Bitmap decodeResource(Resources resources, int i10, Request request) {
        BitmapFactory.Options optionsCreateBitmapOptions = RequestHandler.createBitmapOptions(request);
        if (RequestHandler.requiresInSampleSize(optionsCreateBitmapOptions)) {
            BitmapFactory.decodeResource(resources, i10, optionsCreateBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, optionsCreateBitmapOptions, request);
        }
        return BitmapFactory.decodeResource(resources, i10, optionsCreateBitmapOptions);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        if (request.resourceId != 0) {
            return true;
        }
        return "android.resource".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws FileNotFoundException {
        Resources resources = Utils.getResources(this.context, request);
        return new RequestHandler.Result(decodeResource(resources, Utils.getResourceId(resources, request), request), Picasso.LoadedFrom.DISK);
    }
}
