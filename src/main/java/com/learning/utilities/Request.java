package com.learning.utilities;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Request {
    public Queue <String> requestPath = new ArrayDeque();
    public Map<String,String> requestParams = new HashMap();
    public String requestBody;

    public Request(){}

}
