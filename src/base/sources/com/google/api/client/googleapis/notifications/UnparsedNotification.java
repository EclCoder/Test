package com.google.api.client.googleapis.notifications;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class UnparsedNotification extends AbstractNotification {
    private InputStream contentStream;
    private String contentType;

    public UnparsedNotification(long j10, String str, String str2, String str3, String str4) {
        super(j10, str, str2, str3, str4);
    }

    public final InputStream getContentStream() {
        return this.contentStream;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public UnparsedNotification setContentStream(InputStream inputStream) {
        this.contentStream = inputStream;
        return this;
    }

    public UnparsedNotification setContentType(String str) {
        this.contentType = str;
        return this;
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public String toString() {
        return super.toStringHelper().add("contentType", this.contentType).toString();
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setChanged(String str) {
        return (UnparsedNotification) super.setChanged(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setChannelExpiration(String str) {
        return (UnparsedNotification) super.setChannelExpiration(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setChannelId(String str) {
        return (UnparsedNotification) super.setChannelId(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setChannelToken(String str) {
        return (UnparsedNotification) super.setChannelToken(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setMessageNumber(long j10) {
        return (UnparsedNotification) super.setMessageNumber(j10);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setResourceId(String str) {
        return (UnparsedNotification) super.setResourceId(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setResourceState(String str) {
        return (UnparsedNotification) super.setResourceState(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public UnparsedNotification setResourceUri(String str) {
        return (UnparsedNotification) super.setResourceUri(str);
    }
}
