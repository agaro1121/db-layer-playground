package models

sealed trait PcPartType
case object Input extends PcPartType
case object Output extends PcPartType
case object Storage extends PcPartType
case object Memory extends PcPartType
case object CPU extends PcPartType
