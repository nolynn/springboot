package com.lynn.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    public long id;
    @NonNull
    public String name;
    @NonNull
    public String age;
}
