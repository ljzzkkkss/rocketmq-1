/*
 * Copyright 2018 Qunar, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.store.delay.model;

public class AppendScheduleLogRecordResult implements RecordResult<ScheduleLogSequence> {
    private PutMessageStatus status;

    private AppendMessageResult<ScheduleLogSequence> result;


    public AppendScheduleLogRecordResult(PutMessageStatus status, AppendMessageResult<ScheduleLogSequence> result) {
        this.status = status;
        this.result = result;
    }

    @Override
    public PutMessageStatus getStatus() {
        return status;
    }

    @Override
    public AppendMessageResult<ScheduleLogSequence> getResult() {
        return result;
    }

}
