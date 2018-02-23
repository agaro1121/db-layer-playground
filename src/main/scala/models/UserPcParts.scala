package models

import java.util.UUID

case class UserPcParts(id: UUID, partType: PcPartType, ts: String, originalEventId: UUID)
