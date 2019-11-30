package com.example.orderdemo.shipping.command.api;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ShipmentPreparedEvt {

    String shipmentId;

    String destination;
}