Layered Architecture


 DAO   -- layer   -- data operation
  | @Repository
  | uses model/bean file
  |
 Service Layer   --  uses dao layer-- checks the error and communicate with client
  | @Service
  | uses model/bean file
  | uses dao layer
  | uses exceptions / errors
 Client Layer
    Presentation Layer








