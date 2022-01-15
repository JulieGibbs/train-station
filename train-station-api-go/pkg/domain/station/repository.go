package station

import (
	"github.com/Darkness4/train-station-api/pkg/domain/entities"
)

type Repository interface {
	Preload() error
	GetManyAndCount(s string, limit int, page int, userId string) ([]*entities.Station, int64, error)
	GetOne(id string, userId string) (*entities.Station, error)
	CreateOne(station *entities.Station, userId string) (*entities.Station, error)
	CreateMany(stations []*entities.Station, userId string) ([]*entities.Station, error)
	MakeFavoriteOne(id string, isFavorite bool, userId string) (*entities.Station, error)
	Count(s string) (int64, error)
}