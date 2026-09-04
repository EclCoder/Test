package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LoggingStreamingContent implements StreamingContent {
    private final StreamingContent content;
    private final int contentLoggingLimit;
    private final Logger logger;
    private final Level loggingLevel;

    public LoggingStreamingContent(StreamingContent streamingContent, Logger logger, Level level, int i10) {
        this.content = streamingContent;
        this.logger = logger;
        this.loggingLevel = level;
        this.contentLoggingLimit = i10;
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        LoggingOutputStream loggingOutputStream = new LoggingOutputStream(outputStream, this.logger, this.loggingLevel, this.contentLoggingLimit);
        try {
            this.content.writeTo(loggingOutputStream);
            loggingOutputStream.getLogStream().close();
            outputStream.flush();
        } catch (Throwable th2) {
            loggingOutputStream.getLogStream().close();
            throw th2;
        }
    }
}
